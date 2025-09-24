## Introduction

Networking is a concept of connecting two or more computing devices
together so that we can share resources. Networking consists of three
fundamental components: the *Server*, the *Client*, and the *Network*.
*Server* provides services, *Client* consumes services, and *Network*
connects them together.

Client initiates communication, which is called a *request*. Server
replies to the request, which is called a *response*.

![](media/image1.png){width="4.302083333333333in"
height="1.3473042432195976in"}

**Server:** Server is not a machine, a server is the *process* that
provides some kind of service. For example, an FTP server provides file
transfer services, a mail server provides mail services, and a web
server provides web content.

**Client:** Client is not a machine, client is the process that consumes
services provided by a server. For example, an FTP client is used to
download or upload files, a mail client (outlook express) is used to
send and receive emails, and a web client (browser) is used to access
websites.

A single or multiprocessor machine can host multiple client and server
processes together.

## Network Basics

**IP Address:** An Internet Protocol address (also known as an IP
address) is a unique numerical 32-bit long label assigned to each device
(e.g., computer, printer) participating in a computer network that uses
the Internet Protocol for communication. It is composed of octets that
range from 0 to 255. IP Address uniquely identifies each Machine over
the network.

IP addresses can be classified into 5 categories, Class A, Class B,
Class C, Class D, and Class E.

![](media/image2.png){width="2.7847222222222223in"
height="0.8119608486439195in"}

Figure: Computers have unique IP address

**Port Number:** A port number is a unique 16-bit unsigned number that
is assigned to a process by the operating system.

Concurrent processes running on an operating system are uniquely
identified by port numbers. All server and client processes are assigned
a unique port number. An application is a process for the operating
system.

![](media/image3.png){width="3.8243055555555556in"
height="1.5756944444444445in"}

Figure: Applications (processes) have different ports

A computer has a single connection to the network. All network data
targeted to the computer are received through this connection. However,
received data may be intended for different applications running on the
computer. How can the computer determine which application should
receive the forwarded data? Answer is the port number that will identify
the target application.

Port numbers range from 0 to 65535. The port numbers ranging from 0 -
1023 are restricted, they are reserved to be used by well-known services
such as HTTP and FTP and other system services. These ports are called
*well-known ports*.

Developers are advised to use port number 1024 or above for their custom
server and client applications.

**\
**

**Some well-known reserved ports:**

  -----------------------------------------------------------------------------
  **\#**   **Service**                    **Port Number**
  -------- ------------------------------ -------------------------------------
  1        HTTP Server                    80

  2        FTP Server                     21

  3        SMTP Mail Server               25

  4        POP3 Mail Server               110

  5        IMAP Mail Server               143

  6        Telnet                         23
  -----------------------------------------------------------------------------

Data transmitted over the internet is accompanied by target address
information. Address information consists of IP address and port number.
The computer is identified by its 32-bit IP address, and TCP/ UDP
protocol uses port number to identify the right application to deliver
the data.

**Protocol:** A *protocol* is a set of rules and guidelines for
communicating data over the network. Rules are defined for each step and
process during communication between two or more computers. Networks
have to follow these rules to successfully transmit data.

Client and server processes communicate over the network using
Transmission Control Protocol (TCP) or User Datagram Protocol (UDP).

**Internet Protocols:** The Internet Protocol family contains a set of
related and most widely used network protocols. Higher-level protocols
like TCP, UDP, HTTP (Hypertext Transfer Protocol), and FTP (File
Transfer Protocol) are integrated with IP to provide additional network
communication capabilities.  

Similarly, lower-level Internet Protocols co-exist with IP. In general,
higher level protocols in the IP family interact more closely with
applications like web browsers while lower-level protocols interact with
network adapters and other computer hardware.

Modern operating systems contain built-in services or daemons that
implement support for required network protocols. Applications like web
browser contain software libraries to support high-level protocols
necessary to communicate over network. Few lower-level TCP/IP and
routing protocols are installed at the hardware (silicon chipsets) to
improve the performance.

**Protocol Stack:** A group of network protocols that work together at
higher and lower levels are often called a protocol stack. Traditionally
it follows OSI (Open Systems Interconnection) model.

The **TCP/IP** protocol stack uses four layers that map to the OSI
model:

![](media/image4.png){width="1.6243055555555554in"
height="1.94375in"}**Data Link Layer:** It combines the physical and
data layers and routes the data between devices on the same network. It
also manages the exchange of data between the network and other devices.

**Network Layer**: The Internet Protocol (IP) is responsible for the
delivery of data packets from the source host to the destination host.
It uses IP addresses from packet header. It routes the data packets and
delivers them.

**Transport Layer:** This layer is responsible for making packets of
application data, creating the session between devices, and sending or
receiving the data packets. This layer contains two protocols, TCP
and UDP.

**TCP** provides a point-to-point, reliable, ordered, and error-checked
delivery of data stream. It has a packet delivery acknowledgment system
in order to make reliable communication.

HTTP, FTP, and Telnet are all examples of applications that require a
reliable communication channel.  

**UDP** (User Datagram Protocol) is a protocol that sends independent
packets of data, called *datagrams*, from one computer to another with
no guarantee of arrival. UDP is not connection-based like TCP.

Sending datagrams is much like sending a letter through the postal
service. The order of letter delivery is not important and is not
guaranteed, and each message is independent of any other.

**Application Layer:** This is an abstraction layer reserved for
communication protocols and methods designed for process-to-process
(application-to-application) communication across the network.
Application protocols like HTTP. FTP, SMTP, POP3, etc. exist on this
layer.  User custom applications come under this layer.

**TCP Vs UDP:**

  -----------------------------------------------------------------------
  **TCP**                                      **UDP**
  -------------------------------------------- --------------------------
  Connection-oriented protocol                 Connectionless  protocol

  Reliable, has a packet delivery              Unreliable, no
  acknowledgment system                        acknowledgement

  Ordered, data packets are delivered in order Unordered, datagrams order
                                               is not decided

  Heavyweight: requires three packets          Lightweight: No additional
  handshake to set up a socket connection      packets are required
  before any user data can be sent.            

  Used by HTTP, HTTPs, FTP, SMTP, Telnet       User by DNS, DHCP, TFTP,
                                               SNMP, RIP, VOIP
  -----------------------------------------------------------------------

**Socket:** A *socket* is the mechanism provided by operating systems to
allow messages to be sent and received between two different processes
on the same or different machines over the network. In other words, a
socket is one endpoint of a two-way communication link between two
programs running on the network.

A socket is bound to a port number so that the layer can identify the
application for which data has been sent.

A socket is a combination of an IP address and a port number. Every TCP
connection can be uniquely identified by its two endpoints.

Socket = IP Address + Port Number

FTP Socket = 208.168.1.200 + 21

Normally, a server runs on a specific computer and has a socket that is
bound to a specific port number. The server just waits and listens to
the socket for a client to make a connection request.

![](media/image5.png){width="2.9375in" height="0.5900382764654418in"}

The client socket connects to the server using server IP and port
number.

## Socket Programming

The java.net package contains a collection of classes and interfaces
that provide low-level communication details. It allows you to read and
write primitive data or objects over the network as a byte stream.

There are socket classes for two major network protocols:

**TCP:** It allows reliable communication between two applications.
Classes ServerSocket and Socket are used for TCP communication.

**UDP:** It is a connection-less protocol. Classes DatagramSocket and
DatagramPacket are used for UDP communication.

### Create a TCP Server and Client 

Class ServerSocket is used to make a TCP server and class Socket is used
to make a TCP client.

**Create a TCP Server**

Server is a program that listens to the client's request and responds to
it. Following steps are required to create a server.

1.  Create a ServerSocket object:

> ServerSocket server = new ServerSocket(1234);

2.  Listen to incoming connection

> Socket client = server.accept();

3.  Create an input stream to read the data from client socket

> DataInputStream in = new DataInputStream( client.getInputStream());

4.  Create an output stream to write the data to client socket

> DataOutputStream out = new DataOutputStream( client.getOutputStream()
> );

5.  Read and write to the client socket

> String greeting = in.readLine();
>
> out.writeBytes("Hello Client\\n");

6.  Close the server socket

> server.close();

**Example of server program:**

Class HelloTCPServer receives string "Hello Server" from client and
sends greeting "Hello Client" back to the client.

![](media/image6.png){width="3.9097222222222223in"
height="0.8866535433070866in"}

Figure: server and client exchange greetings

public class HelloTCPServer {

public static void main(String\[\] args)

throws Exception {

// create a TCP server @ port#1234

**ServerSocket server=new ServerSocket(1234);**

// wait for client

Socket client = server.accept();

// open client input stream

DataInputStream in = new

DataInputStream(client.getInputStream());

// open client output stream

DataOutputStream out = new

DataOutputStream(client.getOutputStream());

// read greeting sent by client

String greeting = in.readLine();

System.out.println(greeting);

// write greeting back to the client

out.writeBytes(\"Hello Client\\n\");

// close client connection

client.close();

// close server

server.close();

}

}

Start server program before you start your client program.

**Create a TCP Client**

The client is a program that initiates a network connection. Following
steps are required to create a client.

1.  Create a socket object and connect to server IP and Port

Socket client = new Socket(\"127.0.0.1\", 1234);

2.  Create an input stream to read the data from server

> DataInputStream in = new DataInputStream( client.getInputStream());

3.  Create an output stream to write the data to server

> DataOutputStream out = new DataOutputStream( client.getOutputStream()
> );

4.  Write and read from the server

> out.writeBytes("Hello Server\\n");
>
> String greeting = in.readLine();

5.  Close the client socket

> client.close();

**Example of client program:**

Class HelloTCPClient sends string "Hello Server" to the server and
receives greeting "Hello Client" from the server.

public class HelloTCPClient {

public static void main(String\[\] args)

throws Exception {

// connect to server.

**Socket client = new Socket(\"localhost\", 1234);**

// open client input stream

DataInputStream in =

new DataInputStream(client.getInputStream());

// open client output stream

DataOutputStream out =

new DataOutputStream(client.getOutputStream());

// write greetings to server

**out.writeBytes(\"Hello Server\\n\");**

// read greeting sent by server

**String greeting = in.readLine();**

System.out.println(greeting);

// close connection with server

client.close();

}

}

**Key Methods of ServerSocket Class**

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  **\#**   **Method**                                                                                                                                    **Description**
  -------- --------------------------------------------------------------------------------------------------------------------------------------------- --------------------------------------------------
  1        [accept](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/ServerSocket.html#accept%28%29)()                   Listens to a connection request from client socket
                                                                                                                                                         and accepts it.

  2        [close](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/ServerSocket.html#close%28%29)()                     Closes the socket.

  3        [getInetAddress](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/ServerSocket.html#getInetAddress%28%29)()   Returns the IP address of the server.

  4        [getLocalPort](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/ServerSocket.html#getLocalPort%28%29)()       Returns the listening port number.
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Key Methods of Socket Class**

  -----------------------------------------------------------------------------
  **\#**   **Method**          **Description**
  -------- ------------------- ------------------------------------------------
  1        close()             Closes socket.

  2        getInputStream()    Returns an input stream from the socket.

  3        getOutputStream()   Returns an output stream from the socket.

  4        getInetAddress()    Returns the IP address of the socket.

  5        getLocalAddress()   Gets the IP address of socket.

  6        getLocalPort()      Returns socket port number.

  7        getPort()           Returns the remote port to which this socket is
                               connected.
  -----------------------------------------------------------------------------

![](media/image7.png){width="0.6041666666666666in"
height="0.6041666666666666in"}Write a TCP Echo-Server that will receive
a string from client and echo the string back to the client. When a
client sends string 'Bye', then connection will be closed by server.
Server will listen to request of client at port number 4444.

TCP client will read text from keyboard and keep on sending it to the
server. Client will print all echo strings received from the server at
console. When client wants to close the conversation then it will send
string 'Bye'.

![](media/image8.png){width="4.011444663167104in"
height="0.9097222222222222in"}

Figure: Echo Server and Echo Client

**Echo Server Program**

public class EchoServer {

public static void main(String\[\] a)throws IOException {

//Start Server @ port# 4444

**ServerSocket sSocket=new ServerSocket(4444);**

System.out.println(\"Server Started\");

Socket cSocket = null;

boolean flag = true;

while (flag) {//Infinite loop

**cSocket=sSocket.accept();//Receive client**

**talk(cSocket);**

}

// Closing Server

sSocket.close();

System.out.println(\"Server Closed\");

}

//Talk to the client

**static void talk(Socket cSocket) throws IOException{**

// Open client\'s writer

PrintWriter out =

new PrintWriter(cSocket.getOutputStream(),true);

// Open client\'s reader

BufferedReader in = new BufferedReader(

new InputStreamReader(cSocket.getInputStream()));

// Read text from Client

**String line = in.readLine();**

while (line != null) {

System.out.println(\"Server Received:\"+line);

**out.println(line+\" .. \"+line); //Echo**

if (line.equals(\"Bye\")) {

**break; //Break loop**

}

**line = in.readLine();// Read next line**

}

out.close();

in.close();

cSocket.close();//close client

}

}

**Echo Client Program**

public class EchoClient {

public static void main(String\[\] args)

throws IOException {

// Connect to server

**Socket cSocket=new Socket(\"127.0.0.1\",4444);**

// Open client\'s writer

PrintWriter out=new PrintWriter( cSocket.getOutputStream(),true);

// Open client\'s reader

BufferedReader in = new BufferedReader(

new InputStreamReader(cSocket.getInputStream()));

System.out.println(\"Client Started\");

// Open Keyboard reader

**BufferedReader stdIn =**

**new BufferedReader(new InputStreamReader(System.in));**

// Read line from Keyboard

String line = stdIn.readLine();

while (line != null) {

// Write text to Server

**out.println(line);**

// Received echo string from server

**System.out.println(\"Echo:\" + in.readLine());**

**if (\"Bye\".equals(line)) {**

break; //Break loop

}

**line = stdIn.readLine();//next line**

}

out.close();

in.close();

stdIn.close();

cSocket.close(); //Close client

}

}

**Output**

+-----------------------------------------------------------------------+
| Client Started                                                        |
|                                                                       |
| hello                                                                 |
|                                                                       |
| Echo: hello .. hello                                                  |
|                                                                       |
| how r u                                                               |
|                                                                       |
| Echo: how r u .. how r u                                              |
|                                                                       |
| I m Good                                                              |
|                                                                       |
| Echo: I m Good .. I m Good                                            |
+=======================================================================+
+-----------------------------------------------------------------------+

### Exception Handling 

When an input-output error occurs then ServerSocket and Socket classes
throw java.io.IOException exception.

IOException will be thrown in following cases:

1.  When ServerSocket and Socket classes are instantiated.

2.  When accept() method of ServerSocket gets an error while waiting for
    a connection.

3.  When close() method is called ServerSocket and socket classes.

4.  When getInputStream and getOutputStream methods are called for a
    socket.

### Create UDP Server and Client

Some applications do not require reliable, point-to-point channels to
communicate over a network. They want to deliver independent packets of
information whose arrival and order of arrival are not guaranteed.
Applications can use UDP protocol to send such packets called *datagram*
over the network.

A *datagram* is an independent, self-contained message sent over the
network whose arrival, arrival time, and order of arrival are not
guaranteed.

The DatagramSocket and DatagramPacket classes implement
system-independent datagram communication using UDP.

DatagramPacket is just like a letter or postcard. It is an independent
and self-contained message. Its arrival time and order of arrival are
not guaranteed.

DatagramSocket is just like post-office that sends and receives letters.

![](media/image9.png){width="4.0209175415573055in"
height="1.623999343832021in"}

Figure: UDP Communication

Following steps are required to create a datagram socket:

1.  Create datagram socket. Provide port number in case of server
    socket.

> DatagramSocket socket = new DatagramSocket(4445);

2.  Create new packet.

// Create a data byte buffer

byte\[\] buf = new byte\[256\];

// Encapsulate server IP address

InetAddress address = InetAddress.getByName(\"127.0.0.1\");

// Create a new packet

DatagramPacket packet =

new DatagramPacket(buf, buf.length, address, 5555);

3.  Send packet.

socket.send(packet);

4.  Wait and receive a packet.

byte\[\] buf = new byte\[256\];

// Create an empty data packet

DatagramPacket packet=new DatagramPacket(buf, buf.length);

// Wait for a packet and receive

socket.receive(packet);

5.  Close the socket.

socket.close();

![](media/image7.png){width="0.6041666666666666in"
height="0.6041666666666666in"}Write a UDP Quote-Server that will receive
packets from client and send back random quotes to client's IP address.
Client will first send an empty packet to the server then client will
receive packet from server. Packet will contain today's quote. Server
will receive packets on port number 4445.

**Quote Server Program**

public class QuoteServer {

public static void main(String\[\] args)throws IOException {

String\[\] quotes={\"Bura Mat Dekho\",\"Bura Mat kaho\",

\"Bura Mat suno\"};

// Start UDP socket@port#4445

DatagramSocket socket=new DatagramSocket(4445);

// Create a byte buffer

byte\[\] buf = new byte\[256\];

// Create an empty data packet

DatagramPacket packet=

new DatagramPacket(buf, buf.length);

boolean flag = true;

while (flag) {

// Wait and receive a packet

**socket.receive(packet);**

// Get Sender\'s IP Address

**InetAddress address=packet.getAddress();**

// Get Sender\'s Port Number

**int port = packet.getPort();**

// Get random index number between 0 to 2

int ind = (int) (Math.random() \* 2);

// Get random quote

byte\[\] quote = quotes\[ind\].getBytes();

// Create a new packet with quote

**DatagramPacket quotePkt =**

**new DatagramPacket(quote,quote.length,address, port);**

// Send packet

**socket.send(quotePkt);**

}

socket.close();

}

}

**Quote Client Program**

public class QuoteClient {

public static void main(String\[\] args)throws IOException {

// Create UDP socket

**DatagramSocket socket = new DatagramSocket();**

byte\[\] buf = new byte\[256\];

// Encapsulate Server\'s IP Address

InetAddress address= InetAddress.getByName(\"127.0.0.1\");

// Create a new packet

**DatagramPacket packet =**

**new DatagramPacket(buf, buf.length, address, 4445);**

// Send packet

**socket.send(packet);**

// Create an empty data packet

packet =new DatagramPacket(buf, buf.length);

// Wait for a packet and receive

**socket.receive(packet);**

// Convert to string

String received= new String(packet.getData());

System.out.println(\"Quote of the Moment: \" + received);

socket.close();

}

}

**\
**

**Key Methods of DatagramSocket Class**

  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  **\#**   **Method**                                                                                                                                    **Description**
  -------- --------------------------------------------------------------------------------------------------------------------------------------------- -------------------------------------------
  1        connect(*InetAddress*, *int*)                                                                                                                 Connects this Socket to a remote address.
                                                                                                                                                         Packets will be sent and received from this
                                                                                                                                                         address only.

  2        [getInetAddress](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramSocket.html#getInetAddress())()     Returns the address to which this socket is
                                                                                                                                                         connected.

  3        [getLocalAddress](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramSocket.html#getLocalAddress())()   Gets the local address to which the socket
                                                                                                                                                         is bound.

  4        [getLocalPort](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramSocket.html#getLocalPort())()         Returns the port number to which this
                                                                                                                                                         socket is bound.

  5        [getPort](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramSocket.html#getPort())()                   Returns the port for this socket.

  6        receive(DatagramPacket)                                                                                                                       Receives a datagram packet from this
                                                                                                                                                         socket.

  7        send(DatagramPacket)                                                                                                                          Sends a datagram packet from this socket.

  8        close()                                                                                                                                       Closes this datagram socket.
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Key Methods of DatagramPacket Class**

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  **\#**   **Method**                                                                                                                                                         **Description**
  -------- ------------------------------------------------------------------------------------------------------------------------------------------------------------------ -----------------------------------------
  1        getAddress()                                                                                                                                                       IP address of sender or receiver

  2        [getData](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#getData())()                                        Data ( byte array) of packet

  3        [getLength](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#getLength())()                                    Length of data

  4        [getPort](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#getPort())()                                        Port number of sender or receiver

  5        [setAddress](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#setAddress(java.net.InetAddress))(InetAddress)   Sets the IP address of receiver

  6        [setData](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#setData(byte[]))(byte\[\])                          Sets the data buffer for this packet

  7        [setPort](http://pic.dhe.ibm.com/infocenter/adiehelp/v5r1m1/topic/com.sun.api.doc/java/net/DatagramPacket.html#setPort(int))(int)                                  Sets the Port Number of receiver
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Broadcast (Multicast) Server

Java has a class java.net.MulticastSocket. This class is used to make
the clients who receive broadcast messages. A message will be
broadcasted to a group, and all clients belonging to this group will get
the broadcasted message. It is a kind of one-to-many messaging.

Class DatagramSocket is used to make a server that broadcasts a message
to the group instead of a single client. Clients are made by
MulticastSocket class.

Here is an example code to create a Multicast client.

//Setup group port 3336

**MulticastSocket socket=new MulticastSocket(3336);**

//Setup group IP address

InetAddress group = **InetAddress.getByName(\"202.0.202.0\");**

//Join the group

**socket.joinGroup(group);**

//create empty packet

byte\[\] buf = new byte\[256\];

DatagramPacket packet=new DatagramPacket(buf, buf.length);

//Receive broadcasted message

**socket.receive(packet);**

//Print message

String received = new String(packet.getData());

System.out.println(\"Message: \" + received);

//Leave the group

**socket.leaveGroup(group);**

//Close the socket

socket.close();

Multicast client group is listening messages on port number 3336 and
group is identified by a group identifier \"202.0.202.0\". Group
identifier \"202.0.202.0\" is not the internet address of the machine on
which a single client is running. Group identifier is arbitrarily
chosen.

Here is the code to make multicast server

//Start server at port 4446

DatagramSocket socket =new DatagramSocket(4446);

//Group information

**InetAddress groupIP = InetAddress.getByName(\"202.0.202.0\");**

**int groupPort = 3336;**

**byte\[\] msg = \"Good Morning\".getBytes();**

//Create a packet for group

**DatagramPacket packet = new DatagramPacket(**

**msg, msg.length, groupIP, groupPort);**

//Broadcast message to group

**socket.send(packet);**

socket.close();//Close socket

Run both programs and watch the output.

## Working with URL

URL stands for Uniform Resource Locator and is a reference (an address)
to a resource on the Internet. It has two parts, protocol identifier,
and resource name. The protocol identifier and the resource name are
separated by a colon and two forward slashes.

![](media/image10.png){width="2.8358213035870516in"
height="0.6810793963254593in"}

The protocol identifier indicates the name of the protocol to be used to
fetch the resource. The resource name is the complete address of the
resource. The format of the resource name depends entirely on the
protocol used but for many protocols, including HTTP, the resource name
contains one or more of the following components:

-   **Host Name:** The name of the server.

-   **Port Number:** The port number of the server (optional).

-   **File Name:** The relative path name to the file on the server.

-   **Reference:** A reference to a named anchor within a resource that
    usually identifies a specific location within a file (typically
    optional).

**Read from URL**

Java contains URL class to handle and read data from URL.

**Key Methods of URL Class**

  ---------------------------------------------------------------------------
  **\#**   **Method**               **Description**
  -------- ------------------------ -----------------------------------------
  1        getProtocol()            It returns the protocol of the URL

  2        getHost ()               It returns the host Name of the URL

  3        getPort ()               It returns the Port Number of the URL

  4        getFile()                It returns the filename of the URL
  ---------------------------------------------------------------------------

![](media/image7.png){width="0.6041666666666666in"
height="0.6041666666666666in"}Write a program to display URL information
and read contents of a web page from the URL. This program connects to
url [www.sunilos.com](http://www.sunrays.co.in) and reads URL contents.

public class URLReader {

public static void main(String\[\] args)throws Exception {

**URL u = new URL(\"http://www.sunilos.com:80/Home\");**

System.out.println(\"Protocol: \" + u.getProtocol());

System.out.println(\"Host Name: \" + u.getHost());

System.out.println(\"Port Number: \" + u.getPort());

System.out.println(\"File Name: \" + u.getFile());

// Open input channel to read data

**InputStream iStr = u.openStream();**

// Scanner will convert bytes into text

Scanner in = new Scanner(iStr);

// Read text line by line from URL

while (in.hasNext()){

String html = in.nextLine();

System.out.println(html);

}

in.close();

}

}

Run this program and watch the output.

**Write to URL**

Java contains URLConnection class in java.net package to handle a
communication link between the URL. This class can be used to read and
write data to the URL.

![](media/image7.png){width="0.6041666666666666in"
height="0.6041666666666666in"}Write a program to send parameters to a
URL and read the contents on the basis of sent parameters. Here is an
example program that will send a search parameter 'java' to
[www.ask.com](http://www.ask.com) and get the search results of 'java'
keyword.

public class URLWriter {

public static void main(String\[\] args) throws Exception {

**URL url =new URL(\"http://www.ask.com/web\");**

**String question = \"java\";**

// Create URLConnection object

URLConnection conn = url.openConnection();

**// Inform URLConnection object for**

**//writing parameters**

**conn.setDoOutput(true);**

**// Open output stream**

**OutputStreamWriter out=**

**new OutputStreamWriter(conn.getOutputStream());**

**// Write question parameter**

**out.write(\"q=\" + question);**

**// Close output stream**

**out.close();**

// Connect to the Server

conn.connect();

// Open input channel to read data

InputStream iStr = conn.getInputStream();

// Scanner will convert bytes into text

Scanner in = new Scanner(iStr);

System.out.print(\"URL contents \*\*\*\");

// Read text line by line from URL

while (in.hasNext()) {

String html = in.nextLine();

System.out.println(html);

}

in.close();

}

}

Run this program and watch the output.

## Exercise 

1.  Create a multithreaded TCP Echo-Server that will handle multiple
    concurrent clients at a time. Server will listen to incoming
    requests at port number 4444. On receiving a request, it will create
    a separate thread for each client to communicate with them.

2.  Create a Chat-Server and Chat-Client for text communication using
    UDP protocol. Chat-Server will receive data packets at port number
    4445.

3.  Make a downloader program that will download a web page and its
    sub-links up to two levels from a given URL. Page URL will be passed
    as a command line argument.

## Expected Interview Questions

1.  What is TCP/IP stack?

2.  What are the differences between TCP and UDP protocols?

3.  Why is TCP called a reliable protocol?

4.  Why is UDP an unreliable protocol?

5.  What is a socket? How does it communicate?

6.  Why do you use InetAddress class?

7.  What is a datagram and datagram socket?

8.  Which classes will you use to make a TCP client and server?

9.  Which classes will you use to make a UDP client and server?

10. Which kind of applications can be built on UDP protocol?

11. Which kind of applications can be built on TCP protocol?

12. How can you read data from a URL?

13. Why URLConection class is used?

14. How can you write parameters to a URL?
