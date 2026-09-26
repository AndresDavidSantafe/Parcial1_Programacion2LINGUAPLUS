# Pensamiento computacional Abstraccion 

Integrantes: Juan Diego Quitian Rengifo (C.C.1090275278) – Andres David Santafe Lopez (C.C. 1023378835 )
¿Que se solicita finalmente? 

Un sistema para La academia LinguaPlus donde le permita gestionar y controlar la información de matrícula de estudiantes y de su plantilla, que permita elegir distintas modalidades y servicios para su aprendizaje, controlar el rol de sus docentes 

¿Que informacion es relevante? 

Academia: nombre comercial, NIT, dirección, teléfono, correo electrónico 

y página web 

Programa Formación: código, nombre, idioma, descripción, duración en meses, 

valor mensual y estado (Activo, Suspendido, Finalizado). Tipo programa (programas básicos, programas intensivos y programas personalizados). Diferentes servicios, modalidad (presencial, virtual) dependiendo la modalidad tiene acceso 

ServicioAdicional: código, nombre, descripción, precio y disponibilidad. (examen de nivelación, simulacro de certificación internacional, material de estudio o talleres especiales) 

Estudiante: nombre completo, documento de identidad, teléfono, correo electrónico, edad y fecha de registro 

Docente: identificación, nombre, idioma de especialidad, teléfono y tarifa por sesión 

Matricula: número -consecutivo de matricula, el estudiante, el programa adquirido y la fecha de inicio 

Periodo: programas, horarios y cupos 

Pagos: comprobante de pagos 

¿Cómo se agrupa la información relevante? 

|Grupo|Clase|Atributos|
|---|---|---|
|Gestion:registrar|Matricula<br>Docente<br>Estudiante|número de matrícula, el<br>estudiante, el programa<br>adquirido y la fecha de inicio,<br>opcionales|
|Oferta:OfertaAcademica|PeriodoAcademico<br>ProgramaFormacion<br>ServicioAdicional|Salon, código, nombre,<br>idioma, descripción,<br>duración en meses,<br>valor mensual|
|Factura:emitir|ComprobantePago||
|Datos del negocio|Academia|nombre comercial, NIT,<br>dirección, teléfono, correo<br>electrónico<br>y página web|



¿Qué funcionalidades solicitan finalmente? 

# Registrar 

RF-001: Registrar programas de formación con sus atributos propios, modalidad, beneficios 

RF-002: registrar Estudiante con sus atributos 

RF-003: registrar Matricula sin que se repita su consecutivo único asociado al estudiante RF-004: 

RF-005: no crear matriculas sin programa 

RF-006: registrar docentes según sus atributos obligatorios 

# emitir 

RF-007: emitir comprobante de pago según el formato (PDF, Excel u otros). RF-008: asignar servicios adicionales solicitados por los estudiantes 

# consultar 

RF-009: consultar historial de pagos según la fecha RF-0010: consultar un estudiante mediante su número de teléfono y RF-011: determinar si dicho número corresponde a un número perfecto RF-012: consultar la disponibilidad de cupos vigentes en periodos académicos RF-013: asignar docentes a estudiantes o programas 

# Reglas de negocio 

|enunciado|Regla de negocio|
|---|---|
|Un estudiante puede adquirir|RN-01: cada estudiante puede tener al|
|diferentesprogramas de formación|menos un de  losprogramas|



|Cada tipo de programa puede incluir<br>diferentes beneficios|RN-02: la matricula debe realizarse<br>con el estudiante, el programa<br>adquirido y la fecha de inicio<br>obligatoriamente|
|---|---|
|Un docente puede atender diferentes<br>estudiantes|RN-03 se debe saber la relación<br>existente entre el estudiante, el<br>programa adquiridoyel docente|
|Los docentes pueden ser asignados<br>como tutores a estudiantes que<br>adquieran programas<br>personalizados.|RN-04: El docente puede tener un rol<br>distinto al de docente|
|permitir buscar un<br>estudiante mediante su número de<br>teléfono y determinar si dicho número<br>corresponde a un número<br>perfecto|RN-04: Buscar un estudiante por<br>documento y determinar si es número<br>perfecto|
|El número de matrícula es consecutivo<br>y no<br>sepuede repetir nunca|RN-05: No repetir el número de<br>matrícula, evitar duplicados|
|Llenar cupos en un periodo no puede<br>afectar los cupos disponibles del<br>periodo siguiente|RN-06:Cada periodo académico no<br>puede afectar al siguiente|
|Los programas presenciales se<br>entregan con material impreso y carné<br>físico; los programas virtuales, con<br>licencia de acceso a la plataforma y<br>carné digital. Estas combinaciones no<br>sepueden mezclar|RN-07: Cada tipo de modalidad tiene<br>su propia información que no debe<br>mezclarse|
|No puede existir una matrícula sin<br>programa|RN-08: Cada matricula tiene la<br>obligación de tener al menos un<br>programa|
|el descuento no puede superar el 30 %<br>del valor delprograma|RN-09: El descuento máximo es del<br>30% sobre el valor delprograma|



# Descomposicion 

# ¿Como se distribuyen las funcionalidades? 

|modulo|clases|requisitos|Reglas de negocio|
|---|---|---|---|
|registrar|Estudiante,<br>Docente, ,<br>matricula|RF-001,2,3,6|1,2,5,9,3,4<br>1,2,3,4,5,9|
|OfertaAcademica|Modalidad,<br>ServicioAdicional,<br>ProgramaFormacio<br>n|5,13, 8,11|6,7,8|



|Emitir|ComprobantePago<br>i|7|--|
|---|---|---|---|
|consultar|Interfazgrafica|9,10,12|Solo muestra|



# ¿que debo hacer para probar las funcionalidades? 

|modulo||||
|---|---|---|---|
|registrar|1|Estudiante sin<br>programa|No puede<br>registrarse|
|registrar|2|A matricula le<br>falta Estudiante,<br>Fecha o<br>programa|La matrícula no<br>puede crearse|
|registrar|3|No se sabe que<br>rol cumple<br>docente|error|
|registrar|4|Estudiante no<br>encontrado|Error y el<br>estudiante no<br>esta registrado|
|registrar|5|Matricula con<br>mismo<br>consecutivo|error|
|OfertaAcademic<br>a|6|Finalizar 20261<br>con 50 cupos y<br>20262 finalizar<br>con 37 cupos|20261(50)<br>20262(37)|
|OfertaAcademic<br>a|7|Presencial puede<br>ingresar a la<br>plataforma con<br>tarjeta fisica|Error|
|OfertaAcademic<br>a|8|i<br>Matricula sin<br>programas|Error|
|OfertaAcademic<br>a|9|Aplica un<br>descuento del<br>50%|No es posible<br>proceder con el<br>pago|



# ¿que puedo reutilizar? 

|Los programas<br>presenciales se<br>entregan<br>con material impreso y<br>carné físico; los<br>programas virtuales,<br>con licencia de acceso<br>a la plataforma y<br>carné digital. Estas<br>combinaciones no se<br>pueden mezclar:|Debe existir<br>un solo<br>consecutivo<br>de matricula|singleton|ConsecutivoMatricula,<br>Matricula|--|
|---|---|---|---|---|
|la academia ofrece<br>programas<br>básicos, programas<br>intensivos y programas<br>personalizados. Cada<br>tipo de programa<br>puede incluir<br>diferentes beneficios<br>como acceso a la<br>plataforma virtual,<br>clubes de<br>conversación o<br>acompañamiento<br>de un tutor.|Tiene<br>muchas<br>validaciones<br>ademas de<br>atributos<br>opcionales|builder|ProgramaFormacion,|ProgramaFormac<br>ion.Builder|
|Armar esa<br>oferta desde cero<br>requiere consultar la<br>disponibilidad de<br>docentes, salones y<br>tarifas vigentes; lo<br>único<br>que cambia entre un<br>periodo y otro es la<br>fecha y los cupos que<br>se van ocupando|Es mucho<br>ams sencillo<br>y barato<br>copiar<br>plantillas de<br>algo ya<br>realizado|prototype|PeriodoAcademico|Agrega clone()|
|comprobante se<br>genera en PDF,<br>pero el área de<br>contabilidad ya pidió el<br>mismo comprobante<br>en formato Excel para<br>cargarlo a sus|Solo cambia<br>la forma en<br>que se<br>expone la<br>misma info|Factory<br>method|ComprobantePago,<br>FormatoPDF,<br>FormatoExcel|GeneradorComp<br>robante,<br>GeneradorPdf,<br>GeneradorExcel|



|reportes, y la academia<br>está evaluando un<br>tercer formato para el<br>próximo año.|||||
|---|---|---|---|---|
|Los programas<br>presenciales se<br>entregan<br>con material impreso y<br>carné físico; los<br>programas virtuales,<br>con licencia de acceso<br>a la plataforma y<br>carné digital. Estas<br>combinaciones no se<br>pueden mezclar:|Busca no<br>mezclar<br>ambos<br>conceptos|Abstract<br>factory|ProgramaFormacion,<br>ProgramaPresencial,<br>ProgramaVirtual|FabricaMaterial,<br>FabricaCarnetFis<br>ico,<br>FabricaLicencia,<br>FabricaCarnetDi<br>gital|

# Diagrama de clases UML

![](/src/main/resources/images/UML.jpg)
