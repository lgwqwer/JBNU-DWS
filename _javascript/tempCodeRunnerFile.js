const http = require('http');
const fs = require('fs').promises;

http.createServer(async (req, res) => {
  try {
    const f = await fs.readFile('main/index.html');
    res.writeHead(200, {'Content-Type': 'text.html; charset=utf-8'});   // 200이면 서버 요청 성공

    res.end(f);
  } catch (err) { //오류 처리
    console.error(err);   // 요청에 실패했을 경우 오류 출력
    res.writeHead(500, {'Content-Type': 'text.html; charset=utf-8'});  //500이면 서버에 오류 발생
    res.end(err.message); // 에러 메세지와 함께 요청 종료
  }
})
  .listen(8080, () => {
    console.log('8080포트에서 서버 연결 중..');
  })