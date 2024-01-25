const http = require('http');
const fs = require('fs').promises;

http.createServer(async (req, res) => {
  try {
    const f = await fs.readFile('main/index.html');
    res.writeHead(200, {'Content-Type': 'text.html; charset=utf-8'});   // 200�̸� ���� ��û ����

    res.end(f);
  } catch (err) { //���� ó��
    console.error(err);   // ��û�� �������� ��� ���� ���
    res.writeHead(500, {'Content-Type': 'text.html; charset=utf-8'}); //500�̸� ������ ���� �߻�
    res.end(err.message); // ���� �޼����� �Բ� ��û ����
  }
})
  .listen(8080, () => {
    console.log('8080��Ʈ���� ���� ���� ��..');
  })