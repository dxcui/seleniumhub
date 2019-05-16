### selenium docker启动grid模式
1. 启动hub
```bash
docker run -d -p 4444:4444 --name selenium-hub selenium/hub
```
其他更多参数配置
```bash
docker run --name=hub -p 5001:4444 -e GRID_TIMEOUT=0 -e GRID_THROW_ON_CAPABILITY_NOT_PRESENT=true -e GRID_NEW_SESSION_WAIT_TIMEOUT=-1 - e GRID_BROWSER_TIMEOUT=15000 -e GRID_TIMEOUT=30000 
-e GRID_CLEAN_UP_CYCLE=30000 -d selenium/hub:3.7.1-beryllium
```
2. 启动node
```bash
docker run --name=chrome -p 5902:5900 -e NODE_MAX_INSTANCES=6 
-e NODE_MAX_SESSION=6 -e NODE_REGISTER_CYCLE=5000 -e DBUS_SESSION_BUS_ADDRESS=/dev/null -v /dev/shm:/dev/shm --link selenium-hub:hub -d selenium/node-chrome-debug
```
3. testng.xml中 parallel="tests"模式

4. 其他参考 https://github.com/SeleniumHQ/docker-selenium
