<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<form class="testResult" name=" formx" method="POST" action="javascript:voname(null);" onsubmit="teststres()">


	<h3>Чи дратує вас:</h3>
	<div>
		<p>
			<b>1.Зім’ята сторінка газет», яку ви хочете прочитати?</b><Br> <input
				class="test3" type="radio" name="e[0]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[0]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[0]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>2.Не надто молода жінка, вдягнена, як юна дівчина?</b><Br> <input
				class="test3" type="radio" name="e[1]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[1]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[1]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>3. Надмірна близькість співрозмовника під час бесіди?</b><Br>
			<input class="test3" type="radio" name="e[2]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[2]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[2]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>4. Жінка, яка. палить на вулиці або в громадському місці?</b><Br>
			<input class="test3" type="radio" name="e[3]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[3]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[3]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>5. Людина, що кашляє у ваш бік?</b><Br> <input class="test3"
				type="radio" name="e[4]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[4]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[4]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>6. Що хтось гризе нігті на ваших очах?</b><Br> <input
				class="test3" type="radio" name="e[5]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[5]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[5]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>7. Що хтось сміється невлад?</b><Br> <input class="test3"
				type="radio" name="e[6]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[6]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[6]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>8. Що хтось намагається вчити вас, що і як робити?</b><Br> <input
				class="test3" type="radio" name="e[7]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[7]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[7]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>9. Що кохана дівчина (хлопець) завжди запізнюється?</b><Br> <input
				class="test3" type="radio" name="e[8]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio" name="e[8]"
				value="1" required>б) так, але не дуже;<Br> <input
				class="test3" type="radio" name="e[8]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>10. Що в кінотеатрі той, хто сидить попереду, весь час
				крутиться і розмовляв?</b><Br> <input class="test3" type="radio"
				name="e[9]" value="3" required>а) так,безумовно;<Br> <input
				class="test3" type="radio" name="e[9]" value="1" required>б)
			так, але не дуже;<Br> <input class="test3" type="radio"
				name="e[9]" value="0" required>в)ні, у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>11. Що вам переповідають сюжет роману, який ви тільки
				збираєтеся прочитати?</b><Br> <input class="test3" type="radio"
				name="e[10]" value="3" required>а) так,безумовно;<Br> <input
				class="test3" type="radio" name="e[10]" value="1" required>б)
			так, але не дуже;<Br> <input class="test3" type="radio"
				name="e[10]" value="0" required>в)ні, у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>12. Що вам дарують непотрібні речі?</b><Br> <input
				class="test3" type="radio" name="e[11]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio"
				name="e[11]" value="1" required>б) так, але не дуже;<Br>
			<input class="test3" type="radio" name="e[11]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>13. Голосна розмова в громадському транспорті?</b><Br> <input
				class="test3" type="radio" name="e[12]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio"
				name="e[12]" value="1" required>б) так, але не дуже;<Br>
			<input class="test3" type="radio" name="e[12]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>14. Надто сильний запах парфумів?</b><Br> <input
				class="test3" type="radio" name="e[13]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio"
				name="e[13]" value="1" required>б) так, але не дуже;<Br>
			<input class="test3" type="radio" name="e[13]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>15. Людина, яка жестикулює під час розмови?</b><Br> <input
				class="test3" type="radio" name="e[14]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio"
				name="e[14]" value="1" required>б) так, але не дуже;<Br>
			<input class="test3" type="radio" name="e[14]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	<div>
		<p>
			<b>16. Колега, який часто вживає іноземні слова?</b><Br> <input
				class="test3" type="radio" name="e[15]" value="3" required>а)
			так,безумовно;<Br> <input class="test3" type="radio"
				name="e[15]" value="1" required>б) так, але не дуже;<Br>
			<input class="test3" type="radio" name="e[15]" value="0" required>в)ні,
			у жодному разі.<Br>
		</p>
	</div>
	 <button class="btn btn-sample" type="submit">Ввести</button>
</form>
<script src="resources/js/testresult.js"></script>