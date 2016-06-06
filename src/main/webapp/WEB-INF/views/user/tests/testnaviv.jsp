<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<form class="testResult" name=" formx" method="POST" action="javascript:voname(null);" onsubmit="testnaviv()">
 <div> 
   <p><b>1. Після кожного нового повідомлення про будь-яку нову дієту або найраціональніший спосіб життя Ви:</b><Br>
   <input class="test2" type="radio" name="w[0]" value="1" required>а) відразу переглядаєте або навіть змінюєте свій спосіб життя, режим харчування;<Br>
   <input class="test2" type="radio" name="w[0]"value="1" required>б) задумуєтеся, що з цього може знадобитися і Вам;<Br>
   <input class="test2" type="radio" name="w[0]" value="0" required>в) ніколи не звертаєте на це уваги (на Вашу думку, людство і збереглося тому, що ніколи про це не задумувалося).<Br>
  </p>
 </div>
  <div> 
   <p><b>2. Якщо на Вашому обличчі висип чи Ви поранили обличчя під час гоління, Ви:</b><Br>
   <input class="test2" type="radio" name="w[1]" value="1" required>а) не виходите з дому, поки обличчя не заживе, бо Вам здається, що
якщо Ви вийдете в такому вигляді, всі звертатимуть на Вас увагу;<Br>
   <input class="test2" type="radio" name="w[1]"value="1" required>б) Ви намагаєтесь будь-яким чином приховати це, а якщо зустрічаєте кого-небудь із знайомих, відразу ж пояснюєте, що з Вами сталося;<Br>
   <input class="test2" type="radio" name="w[1]" value="0" required>в) Ви не будете звертати на це уваги, цікавість сторонніх Вас не турбує.<Br>
  </p>
 </div>
   <div> 
   <p><b>3. Якщо Ви відчули, що хтось іде за Вами і ледь не наступає Вам на п'яти, Ви:</b><Br>
   <input class="test2" type="radio" name="w[2]" value="1" required>а) прискорюєте крок;<Br>
   <input class="test2" type="radio" name="w[2]"value="1" required>б) Вам все одно, але з цікавості Ви оглядаєтеся і дивитеся, хто це.<Br>
   <input class="test2" type="radio" name="w[2]" value="0" required>в) Ви не будете звертати на це уваги, Вас не ціквить хто це.<Br>
  </p>
 </div>
    <div> 
   <p><b>4. Вам потрібно прийняти рішення, і Ви:</b><Br>
   <input class="test2" type="radio" name="w[3]" value="1" required>а) не говорите з іншими, тому що боїтеся одержати суперечні поради, які зіб'ють Вас;<Br>
   <input class="test2" type="radio" name="w[3]"value="1" required>б) шукаєте поради, але врешті-решт робите по-своєму;.<Br>
   <input class="test2" type="radio" name="w[3]" value="0" required>в) слухаєте лише самого себе.<Br>
  </p>
 </div>
     <div> 
   <p><b>5. Ви трохи захворіли, проте не звертаєтеся до лікаря:</b><Br>
   <input class="test2" type="radio" name="w[4]" value="1" required>а) там багато хворих, які стануть розповідати про власні нездужання, а це Вас роздратовує;<Br>
   <input class="test2" type="radio" name="w[4]"value="1" required>б) у Вас просто немає для цього часу. Ви впевнені, що пройде само собою;.<Br>
   <input class="test2" type="radio" name="w[4]" value="0" required>в) лікар може сказати Вам щось неприємне.<Br>
  </p>
 </div>
     <div> 
   <p><b>6. Якщо на новому місці роботи (навчання) всі раптово починають стверджувати, що Ви дуже симпатична людина, а на попередньому місці у Вас були проблеми в спілкуванні з людьми, то Ви думаєте, що:</b><Br>
   <input class="test2" type="radio" name="w[5]" value="1" required>а) нові колеги (студенти) праві, на старому місці Вас просто не розуміли;<Br>
   <input class="test2" type="radio" name="w[5]"value="1" required>б) вони менш вимогливі;.<Br>
   <input class="test2" type="radio" name="w[5]" value="0" required>в) вони більш спокійні, філософськи до всього ставляться.<Br>
  </p>
 </div>
      <div> 
   <p><b>7. До театру, кіно Ви йдете відразу, як тільки зрозумієте, що герой про якого йдеться:</b><Br>
   <input class="test2" type="radio" name="w[6]" value="1" required>а) схожий на Вас, у нього такі самі проблеми і Вам цікаво, як він їх вирішить;<Br>
   <input class="test2" type="radio" name="w[6]"value="1" required>б) герой та обставини зовсім не схожі на Ваші, тому все це Вам цікаво, щоб порівняти з собою;<Br>
   <input class="test2" type="radio" name="w[6]" value="0" required>в) Ви дивитеся з однаковим задоволенням фільми, спектаклі, не порівнюючи героїв із собою.<Br>
  </p>
 </div>
       <div> 
   <p><b>8. Якщо стверджують, що останнім часом Ваша робота не поліпшується, то:</b><Br>
   <input class="test2" type="radio" name="w[7]" value="1" required>а) це сильно травмує Вас, Ви починаєте працювати ще гірше;<Br>
   <input class="test2" type="radio" name="w[7]"value="1" required>б) Ви самі не помічаєте такого спаду в роботі, тому вважаєте, що Вас хочуть збити з толку;<Br>
   <input class="test2" type="radio" name="w[7]" value="0" required>в) Ви самі намагаєтеся скласти рівень своєї роботи і зробити висновок, що хоча вона і небездоганна, але Ви працюєте з інтересом і не гірше за інших.<Br>
  </p>
 </div>
        <div> 
   <p><b>9. Якщо водій таксі подивиться на Вас з погано прихованою досадою, то Ви:</b><Br>
   <input class="test2" type="radio" name="w[8]" value="1" required>а) вирішите, що він, можливо, людина завжди всім незадоволена;<Br>
   <input class="test2" type="radio" name="w[8]"value="1" required>б) можливо, він дуже втомився;<Br>
   <input class="test2" type="radio" name="w[8]" value="0" required>в) вирішите, що Ви йому просто не сподобались.<Br>
  </p>
 </div> 
         <div> 
   <p><b>10. Як тільки Ви згадуєте про Ваших бабусю і дідуся, з якими Ви не живете разом, або про своїх батьків, то:</b><Br>
   <input class="test2" type="radio" name="w[9]" value="1" required>а) Ви бачите розташування кімнат, предметів у їхньому домі;<Br>
   <input class="test2" type="radio" name="w[9]"value="1" required>б) Вам навіть інколи вчуваються їхні голоси;<Br>
   <input class="test2" type="radio" name="w[9]" value="0" required>в) Вам насамперед пригадується запах у їхньому домі, Ви його майже "відчуваєте".<Br>
  </p>
 </div> 
 
 <!--<a>Якщо Ваші відповіді склали передусім групу "а" і "б", то можна зазначити, що Ви достатньо спокійна, оптимістична людина, яка не позбавлена відповідного рівня самокритики. Ви здатні реагувати на зміни, проте спочатку старанно їх обдумуєте, обговорюєте. Ви піддаєтеся навіянню насамперед відносно тих речей, які найбільше Вас цікавлять.

Якщо у Ваших відповідях понад усе (або навіть усе) "в", то, мабуть, Ви надто самонадійні, часто буваєте впертим. Ви надто легковажно ставитеся до багатьох важливих речей.</a> -->
	 <button class="btn btn-sample" type="submit">Ввести</button>

</form>

<script src="resources/js/testresult.js"></script>