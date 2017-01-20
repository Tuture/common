package fr.ensisa.hassenforder.network;

public interface Protocol {

	public static final int CHATROOMS_CMD_PORT_ID		= 9876;
	public static final int CHATROOMS_MSG_PORT_ID		= 9877;
	
	public static final int RP_OK					= 1;
	public static final int RP_KO					= 2;
	public static final int RP_LOAD				 	= 14;
	public static final int RP_CHANNELS 			= 3;
	public static final int RP_INCOMMING_MESSAGES 	= 4;
	public static final int RP_PENDING_MESSAGES 	= 5;
	
	
	
	public static final int RQ_CONNECT		 		= 6;
	public static final int RQ_CHANNEL  	 		= 7;
	public static final int RQ_LOAD 		 		= 8;
	public static final int  RQ_DISCONNECT 	 		= 9; 
	public static final int  RQ_UNSUSCRIBE 	 		= 10;
	public static final int  RQ_SENTMESSAGE  		= 11;
	public static final int  RQ_APPROBATION  		= 12; // Valider / Invalider un message dans un channel modéré
	public static final int  RQ_SEND_MESSAGE 		= 13;
	
	public static final int FREE = 15;
	public static final int MODERATED = 16;
}
