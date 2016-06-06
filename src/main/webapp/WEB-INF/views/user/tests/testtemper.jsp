<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>

<form class="testResult" name=" formx" method="POST" action="javascript:voname(null);" onsubmit="testtemper()">
 
  	<div> 
   <p><b>1. Ви непосидючі?</b><Br>
   <input class="test4" type="radio" name="r[0]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[0]"value="0"  >ні<Br>
    </p>
 </div>
 	<div> 
   <p><b>2.Ви імпульсивні?</b><Br>
   <input class="test4" type="radio" name="r[1]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[1]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>3.Ви нетерплячі?</b><Br>
   <input class="test4" type="radio" name="r[2]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[2]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>4.Ви ініціативні і рішучі в прийнятті рішень?</b><Br>
   <input class="test4" type="radio" name="r[3]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[3]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>5.Ви наполегливі, іноді до впертості?</b><Br>
   <input class="test4" type="radio" name="r[4]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[4]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>6.Ви спритні, легко орієнтуєтеся в розмові?</b><Br>
   <input class="test4" type="radio" name="r[5]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[5]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>7.У вас нерівномірний ритм діяльності?</b><Br>
   <input class="test4" type="radio" name="r[6]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[6]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>8.Ви любите ризикувати?</b><Br>
   <input class="test4" type="radio" name="r[7]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[7]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>9.Ви швидко прощаєте образи?</b><Br>
   <input class="test4" type="radio" name="r[8]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[8]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>10.У вас швидка мова?</b><Br>
   <input class="test4" type="radio" name="r[9]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[9]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>11.Ви неврівноважені?</b><Br>
   <input class="test4" type="radio" name="r[10]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[10]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>12.Ви нетерпимі до недоліків?</b><Br>
   <input class="test4" type="radio" name="r[11]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[11]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>13.Вас цікавить все нове?</b><Br>
   <input class="test4" type="radio" name="r[12]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[12]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>14.У вас часто змінюється настрій?</b><Br>
   <input class="test4" type="radio" name="r[13]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[13]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>15.Ви веселі і життєрадісні?</b><Br>
   <input class="test4" type="radio" name="r[14]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[14]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>16.Енергія б'є ключем, ви завжди зібрані?</b><Br>
   <input class="test4" type="radio" name="r[15]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[15]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>17.Часто кидаєте почате на півдорозі?</b><Br>
   <input class="test4" type="radio" name="r[16]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[16]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>18.Не завжди адекватно оцінюєте свої сили?</b><Br>
   <input class="test4" type="radio" name="r[17]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[17]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>19.Ваші інтереси та інтереси часто змінюються?</b><Br>
   <input class="test4" type="radio" name="r[18]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[18]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>20.До зміненим планам і новим обставинам звикаєте легко?</b><Br>
   <input class="test4" type="radio" name="r[19]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[19]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>21.Вам не важко відволікатися від своїх справ, ви швидко розбираєтеся з чужою проблемою.?</b><Br>
   <input class="test4" type="radio" name="r[20]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[20]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>22.Ретельне опрацювання деталей і кропітка праця не для вас?</b><Br>
   <input class="test4" type="radio" name="r[21]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[21]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>23.Ви чуйні, любите спілкування.?</b><Br>
   <input class="test4" type="radio" name="r[22]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[22]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>24.Ваша мова виразна і гучна?</b><Br>
   <input class="test4" type="radio" name="r[23]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[23]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>25.Ви не панікуєте навіть у складних ситуаціях, у вас відмінне самовладання?</b><Br>
   <input class="test4" type="radio" name="r[24]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[24]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>26.Легко засинаєте і швидко прокидаєтеся?</b><Br>
   <input class="test4" type="radio" name="r[25]" value="1"  >так) так,безумовно;<Br>
   <input class="test4" type="radio" name="r[25]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>27.Вам складно зосередитися, прийняти обдумане рішення?</b><Br>
   <input class="test4" type="radio" name="r[26]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[26]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>28.Ви розсіяні, неуважні?</b><Br>
   <input class="test4" type="radio" name="r[27]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[27]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>29.Ви стриманий і холоднокровна людина</b><Br>
   <input class="test4" type="radio" name="r[28]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[28]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>30.У своїх словах і ділах ви відрізняєтеся послідовністю?</b><Br>
   <input class="test4" type="radio" name="r[29]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[29]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>31.Ви обережні і розважливі?</b><Br>
   <input class="test4" type="radio" name="r[30]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[30]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>32.Витримані, вмієте вичікувати?</b><Br>
   <input class="test4" type="radio" name="r[31]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[31]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>33.Неговіркі, не любите порожньо-порожньої балаканини?</b><Br>
   <input class="test4" type="radio" name="r[32]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[32]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>34.Ваша мова розмірено, спокійна?</b><Br>
   <input class="test4" type="radio" name="r[33]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[33]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>35.Ви грамотно розподіляєте свої сили, ніколи не викладається повністю?</b><Br>
   <input class="test4" type="radio" name="r[34]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[34]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>36.У вас існує чіткий режим дня, ви плануєте свої робочі справи?</b><Br>
   <input class="test4" type="radio" name="r[35]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[35]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>37.Спокійно сприймаєте критику, байдужі до осуду?</b><Br>
   <input class="test4" type="radio" name="r[36]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[36]"value="0"  >ні<Br>
    </p>
 </div>
 <div> 
   <p><b>38.Вам важко з ходу перемкнутися на іншу діяльність?</b><Br>
   <input class="test4" type="radio" name="r[37]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[37]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>39.З іншими людьми у вас рівні, гарні відносини?</b><Br>
   <input class="test4" type="radio" name="r[38]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[38]"value="0"  >ні<Br>
    </p>
 </div>
  <div> 
   <p><b>40.Акуратні, педантичні в дрібницях?</b><Br>
   <input class="test4" type="radio" name="r[39]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[39]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>41.Вам складно пристосуватися до нової обстановки і зміненим планам?</b><Br>
   <input class="test4" type="radio" name="r[40]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[40]"value="0"  >ні<Br>
    </p>
 </div>
   <div> 
   <p><b>42.Ви не любите багато рухатися, повільні?</b><Br>
   <input class="test4" type="radio" name="r[41]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[41]"value="0"  >ні<Br>
    </p>
 </div>
 
   <div> 
   <p><b>43.Ви сором'язлива людина?</b><Br>
   <input class="test4" type="radio" name="r[42]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[42]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>44.Нова обстановка викликає у вас замішання?</b><Br>
   <input class="test4" type="radio" name="r[43]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[43]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>45.Ви невпевнені в собі, своїх силах?</b><Br>
   <input class="test4" type="radio" name="r[44]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[44]"value="0"  >ні<Br>
    </p>
 </div>
    <div> 
   <p><b>46.Самотність не обтяжує вас?</b><Br>
   <input class="test4" type="radio" name="r[45]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[45]"value="0"  >ні<Br>
    </p>
 </div>
     <div> 
   <p><b>47.Невдачі і неприємності надовго вибивають вас із колії?</b><Br>
   <input class="test4" type="radio" name="r[46]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[46]"value="0"  >ні<Br>
    </p>
 </div>
     <div> 
   <p><b>48.У складні життєві періоди ви замикається в собі?</b><Br>
   <input class="test4" type="radio" name="r[47]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[47]"value="0"  >ні<Br>
    </p>
 </div>
      <div> 
   <p><b>49.Ви не занадто витривалі, швидко втомлюєтеся?</b><Br>
   <input class="test4" type="radio" name="r[48]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[48]"value="0"  >ні<Br>
    </p>
 </div>
      <div> 
   <p><b>50.Ваша мова тиха, іноді невиразна?</b><Br>
   <input class="test4" type="radio" name="r[49]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[49]"value="0"  >ні<Br>
    </p>
 </div>
      <div> 
   <p><b>51.Ви автоматично переймаєте риси характеру співрозмовника і його манеру говорити?</b><Br>
   <input class="test4" type="radio" name="r[50]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[50]"value="0"  >ні<Br>
    </p>
 </div>
      <div> 
   <p><b>52.Сентиментальні і вразливі?</b><Br>
   <input class="test4" type="radio" name="r[51]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[51]"value="0"  >ні<Br>
    </p>
 </div>
       <div> 
   <p><b>53.Ви перфекціоніст, у вас завищені вимоги до себе і навколишнього світу?</b><Br>
   <input class="test4" type="radio" name="r[52]" value="1"  >так<Br>
   <input class="test4" type="radio" name="r[52]"value="0"  >ні<Br>
    </p>
 </div>
       <div> 
   <p><b>54.Вам властива деяка помисливість і підозрілість?</b><Br>
   <input class="test4" type="radio" name="r[53]" value="1"  >так;<Br>
   <input class="test4" type="radio" name="r[53]"value="0"  >ні<Br>
    </p>
 </div>
     <div> 
   <p><b>55.Вас легко образити?</b><Br>
   <input class="test4" type="radio" name="r[54]" value="1"  >так;<Br>
   <input class="test4" type="radio" name="r[54]"value="0"  >ні<Br>
    </p>
 </div>
     <div> 
   <p><b>56.Вам приємно, коли оточуючі співпереживають вам?</b><Br>
   <input class="test4" type="radio" name="r[55]" value="1"  >так;<Br>
   <input class="test4" type="radio" name="r[55]"value="0"  >ні<Br>
    </p>
 </div>
 
 <button class="btn btn-sample" type="submit">Ввести</button>
 <!-- <a>А тепер давайте розберемося з результатами тесту. У тесті 4 групи питань, у кожній групі 14 тверджень. Перші 14 (з першого по чотирнадцятий твердження) описують холеричний темперамент. Друга група, з 15-го по двадцять восьме твердження описує сангвініка. Третя група, з 29 по 42 - флегматичний тип темпераменту. І остання група, з 43 по 56 твердження описує меланхолійний темперамент. Якщо в якийсь із груп ви отримали більше 10 плюсів, то цей тип темпераменту у вас домінуючий. Якщо кількість плюсів 5-9, то ці риси виражені у вас значною мірою. І якщо позитивних відповідей менше 4, то риси такого типу темпераменту слабко виражені.</a> -->
 
</form>
<script src="resources/js/testresult.js"></script>