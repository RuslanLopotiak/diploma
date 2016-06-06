<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<form class="testResult" name=" formx" method="POST"
	action="javascript:voname(null);" onsubmit="testkomun()">

	<div>
		<p>
			<b>1. Ви очікуєте на буденну ділову зустріч. Чи виводить це вас
				із звичної колії?</b><Br> <input class="test1" name="q[0]"
				type="radio" value="2" required>так<Br> <input
				class="test1" name="q[0]" type="radio" value="1" required>інколи<Br>
			<input class="test1" name="q[0]" type="radio" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>2. Чи не відкладаєте ви візит до лікаря аж доти, доки вже
				зовсім не сила терпіти?</b><Br> <input class="test1" type="radio"
				name="q[1]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[1]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[1]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>3. Чи не викликає у вас невдоволення або збентеження доручення
				виступати з доповіддю чи повідомленням у зв'язку із якоюсь нагодою?</b><Br>
			<input class="test1" type="radio" name="q[2]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[2]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[2]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>4. Ви маєте нагоду поїхати у відрядження до міста, де ніколи
				ще не бували. Чи докладете ви максимум зусиль для того, щоб уникнути
				цієї поїздки?</b><Br> <input class="test1" type="radio" name="q[3]"
				value="2" required>так<Br> <input class="test1"
				type="radio" name="q[3]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[3]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>5. Чи любите ви ділитися своїми переживаннями з іншими?</b><Br>
			<input class="test1" type="radio" name="q[4]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[4]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[4]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b> 6. Чи дратує вас прохання незнайомої людини (показати дорогу,
				назвати час, відповісти на якесь запитання тощо)?</b><Br> <input
				class="test1" type="radio" name="q[5]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[5]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[5]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>7. Чи вірите ви в існування проблеми "батьків і дітей" та в
				тс, що людям різних поколінь важко зрозуміти один одного?</b><Br> <input
				class="test1" type="radio" name="q[6]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[6]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[6]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>8. Чи не посоромитеся ви нагадати знайомому, що він забув
				повернути 10 гривень, що їх ви позичили йому кілька місяців тому?</b><Br>
			<input class="test1" type="radio" name="q[7]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[7]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[7]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>9. У кафе вам подали недоброякісну страву. Чи змовчите ви,
				лише незадоволено відсунувши тарілку?</b><Br> <input class="test1"
				type="radio" name="q[8]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[8]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[8]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>10. У ситуації один на один з незнайомою людиною ви не
				розпочне* те бесіду самі і вам не сподобається, якщо першою
				заговорить вона. Чи це так?</b><Br> <input class="test1"
				type="radio" name="q[9]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[9]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[9]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>11. Вас жахає будь-яка довга черга (у магазині, бібліотеці,
				касі кінотеатру тощо). Вам легше відмовитися від свого наміру, ніж
				встати у хвіст і нудитися в очікуванні?</b><Br> <input
				class="test1" type="radio" name="q[10]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[10]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[10]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>12. Чи боїтеся ви брати участь у залагодженні конфліктної
				ситуації?</b><Br> <input class="test1" type="radio" name="q[11]"
				value="2" required>так<Br> <input class="test1"
				type="radio" name="q[11]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[11]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>13. У вас є власні, суто індивідуальні критерії оцінювання
				творів літератури, мистецтва, культури, ніяких "чужих" думок з цього
				приводу ви не приймаєте. Це так?</b><Br> <input class="test1"
				type="radio" name="q[12]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[12]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[12]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>14. Почувши десь у неофіційній ситуації ("в кулуарах") явно
				помилкову точку зору з добре відомого вам питання, ви, скоріше за
				все, промовчите?</b><Br> <input class="test1" type="radio"
				name="q[13]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[13]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[13]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>15. Чи викликає у вас невдоволення прохання знайомих допомогти
				розібратися в якійсь проблемі чи навчальній темі?</b><Br> <input
				class="test1" type="radio" name="q[14]" value="2" required>так<Br>
			<input class="test1" type="radio" name="q[14]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[14]" value="0" required>ні<Br>
		</p>
	</div>
	<div>
		<p>
			<b>16. Вам легше формулювати свою точку зору (думку, оцінку) у
				письмовій формі, ніж в усній?</b><Br> <input class="test1"
				type="radio" name="q[15]" value="2" required>так<Br> <input
				class="test1" type="radio" name="q[15]" value="1" required>інколи<Br>
			<input class="test1" type="radio" name="q[15]" value="0" required>ні<Br>
		</p>
	</div>
	<div class="underline">
		<input id="TestFormButton" class="wide" name="button_submit"
			type="submit" value="Далі" />
	</div>
	<button class="btn btn-sample" type="submit">Ввести</button>


	<script src="resources/js/testresult.js"></script>
</form>