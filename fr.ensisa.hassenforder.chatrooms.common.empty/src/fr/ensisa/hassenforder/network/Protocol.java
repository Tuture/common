package fr.ensisa.hassenforder.network;

public interface Protocol {

	public static final int CHATROOMS_CMD_PORT_ID		= 9876;
	public static final int CHATROOMS_MSG_PORT_ID		= 9877;
	
	public static final int RP_OK		= 1;
	public static final int RP_KO		= 2;
	public static final int RP_CHANNELS 	= 6;
	public static final int RP_LOAD = 7;
	
	
	
	public static final int RQ_CONNECT	= 3;
	public static final int RQ_CHANNEL  = 4;
	public static final int RQ_LOAD 	= 5;
	
	
	/*public static final int RQ_CREATE_ROOM 		= 11;
	public static final int RQ_GET_ROOM 		= 5;
	public static final int RP_ROOM 		= 6;
	public static final int RQ_SEND_MESSAGE		= 7;
	public static final int RP_VALID 		= 8;
	public static final int REQ_SUSCRIBE  		= 9;
	public static final int RP_ROOM_MESSAGE 		= 10;
*/
}
