
    #rocketmq
    配置：
    # NemeServer地址,可以有多个
    namesrvAddr=192.168.1.154:9876;192.168.1.158:9876
    # 集群名称
    brokerClusterName=DefaultCluster
    # broker名称,主从的名称相同表明相互关联,为同一个broker
    brokerName=broker-a
    # broker的id,一个master可以有多个slave,id为0表示主,大于0表示不同的从
    brokerId=0
    # 在几点做删除消息动作,比如04: 凌晨四点
    deleteWhen=04
    # 在磁盘保存消息的时长,超过会自动删除,在上面配置删除的时间点删除
    fileReservedTime=48
    # 角色有三种:
    #ASYNC_MASTER, 消息同步开始就返回成功状态
    #SYNC_MASTER  表示消息同步完成后再发送完成状态
    #SLAVE   从
    brokerRole=ASYNC_MASTER
    # 刷盘策略,同步和异步
    flushDiskType=ASYNC_FLUSH
    # 监听端口,一台机器上多个Broker要确保端口不冲突
    listenPort=10921
    brokerIP1 = 192.168.1.154
    # 存储消息以及一些配置信息的根目录
    storePathRootDir=/home/rocketmq/store-b

    启动
    1、 Start Name Server
      > nohup sh bin/mqnamesrv &
       > tail -f ~/logs/rocketmqlogs/namesrv.log
       The Name Server boot success...
    2、Start Broker
    远程访问配置：
    修改conf/broker.conf，加上
    namesrvAddr=xxx.xxx.xxx.xxx:9876
    brokerIP1=xxx.xxx.xxx.xxx

     >nohup sh mqbroker -c /home/tomcat/rocketmq-4.7.0/conf/2m-noslave/broker-a.properties > /dev/null 2>&1 &
     nohup sh bin/mqbroker -n localhost:9876 -c conf/broker.conf &
      > tail -f ~/logs/rocketmqlogs/broker.log
       The broker[%s, xxx.xxx.xxx.xxx:10911] boot success...

     #redis 一主二从三哨兵
     启动redis  ./bin/redis-server redis.conf &
     启动sentinel  ./bin/redis-sentinel sentinel.conf &
     配置
     redis：
     公共      port xxx
               bind xxx.xxx.xxx.xxx 127.0.0.1（配置本地也能访问）
               daemonize yes
               protected-mode no
               masterauth <master-password>（如果含密码）
               logfile "/xxx/xxx/xxx/redis.log"
     从        slaveof <masterip> <masterport>


    sentinel：
          port xxx
          sentinel monitor mymaster xxx.xxx.xxx.xxx xxxx 2
          sentinel auth-pass mymaster 123456（如果含密码）
          sentinel down-after-milliseconds mymaster 10000
          sentinel failover-timeout mymaster 60000
          protected-mode no
          daemonize yes
          logfile "/xxx/xxx/xxx/sentinel.log"







