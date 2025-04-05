# Mensajería Instantánea - Primer entrega
## Análisis y Diseño de Sistemas II, UNMdP
### Alumnas Bianchini, Entrocassi, Gigliotti y Stadler

En esta primera entrega, no se implementa ningún tipo de persistencia de datos.
La arquitectura del sistema es P2P. Cada usuario es Servidor y Cliente al mismo tiempo.
Se implementa una GUI para facilitar la interacción del usuario con el sistema.

Funcionalidades:
### 1. Configuracion inicial
   ![image](https://github.com/user-attachments/assets/578fe1f9-071c-4273-b952-4e0b8de7220e)
   
   Al iniciar el sistema, el usuario proporciona un nickname y un número de puerto.

   El sistema valida que el número de puerto este dentro del rango permitido y no esté en uso.
   

### 2. Registro de contactos
  ![image](https://github.com/user-attachments/assets/1501b278-40a4-4ff1-ad87-5670634a1776)
  
   El usuario podra agregar nuevos contactos proporcionando el nickname, ip y puerto del contacto.

   El sistema valida que la IP y el puerto sean validos antes de registrar al contacto

   Se muestra un mensaje de confirmación al registrar a un contacto exitosamente
   


### 3. Gestión de conversaciones

![image](https://github.com/user-attachments/assets/32463d9e-b71e-46d9-bd15-adf3ca8ef27f)

a. Inicio de conversación

Para iniciar una conversacion, el usuario deberá seleccionar un contacto previamente registrado

La nueva conversación aparecerá en la lista de conversaciones activas

b. Visualización de conversaciones

El usuario podrá acceder a una lista de conversaciones en curso

Al seleccionar una conversación, el sistema mostrará los mensajes enviado sy recibidos en orden cronológico, con la indicación de hora de envío

### 4. Envío de mensajes

Mientras el usuario visualiza una conversación podrá ingresar el texto del mensaje en un campo de entrada

Al confirmar el envío, el sistema intentará entregar el mesnaje al destinatario.

Si la entrega falla debido a una desconexión o error de red, se mostrará un mensaje de advertencia indicando el problema

### 5. Recepción de mensajes

Cuando el usuario recibe unmensaje de un contacto con el que tiene una conversación en curso, el sistema lo agregará automáticamente a la conversación

Si el usuario está viendo la conversación en ese momento, el mensaje se mostrará de inmediato

### 6. Notificaciones de mensajes recibidos

![image](https://github.com/user-attachments/assets/02040cc9-29fe-41d2-8c74-8fec0a383fbf)

Cuando el sistema recibe un mensaje de un contacto y la conversación no está en pantalla, se generará una notificación visual en la lista de conversaciones en curso




   
