package uk.ac.ox.cs.xdrone.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.ox.cs.xdrone.services.XDroneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDroneParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xdrone'", "'begin'", "';'", "'end'", "'home'", "'emergencyStop'", "'UP'", "'('", "')'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATE'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXDroneParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDroneParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDroneParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXDrone.g"; }



     	private XDroneGrammarAccess grammarAccess;

        public InternalXDroneParser(TokenStream input, XDroneGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected XDroneGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalXDrone.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalXDrone.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalXDrone.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalXDrone.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_main_0_0= ruleMain ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:77:2: ( ( (lv_main_0_0= ruleMain ) ) )
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            {
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            {
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            // InternalXDrone.g:80:4: lv_main_0_0= ruleMain
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_main_0_0=ruleMain();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"main",
            					lv_main_0_0,
            					"uk.ac.ox.cs.xdrone.XDrone.Main");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:100:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalXDrone.g:100:45: (iv_ruleMain= ruleMain EOF )
            // InternalXDrone.g:101:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXDrone.g:107:1: ruleMain returns [EObject current=null] : (otherlv_0= 'xdrone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )* otherlv_5= 'end' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:113:2: ( (otherlv_0= 'xdrone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )* otherlv_5= 'end' ) )
            // InternalXDrone.g:114:2: (otherlv_0= 'xdrone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )* otherlv_5= 'end' )
            {
            // InternalXDrone.g:114:2: (otherlv_0= 'xdrone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )* otherlv_5= 'end' )
            // InternalXDrone.g:115:3: otherlv_0= 'xdrone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getXdroneKeyword_0());
            		
            // InternalXDrone.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDrone.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDrone.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalXDrone.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMainAccess().getBeginKeyword_2());
            		
            // InternalXDrone.g:141:3: ( ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXDrone.g:142:4: ( (lv_commands_3_0= ruleCommand ) ) (otherlv_4= ';' )?
            	    {
            	    // InternalXDrone.g:142:4: ( (lv_commands_3_0= ruleCommand ) )
            	    // InternalXDrone.g:143:5: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalXDrone.g:143:5: (lv_commands_3_0= ruleCommand )
            	    // InternalXDrone.g:144:6: lv_commands_3_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getCommandsCommandParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_3_0,
            	    							"uk.ac.ox.cs.xdrone.XDrone.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalXDrone.g:161:4: (otherlv_4= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalXDrone.g:162:5: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMainAccess().getSemicolonKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMainAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleCommand"
    // InternalXDrone.g:176:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:176:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:177:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalXDrone.g:183:1: ruleCommand returns [EObject current=null] : ( ( () ruleHOME ) | ( () ruleEMERGENCY ) | this_UP_4= ruleUP | this_DOWN_5= ruleDOWN | this_LEFT_6= ruleLEFT | this_RIGHT_7= ruleRIGHT | this_FORWARD_8= ruleFORWARD | this_BACKWARD_9= ruleBACKWARD | this_ROTATE_10= ruleROTATE ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_UP_4 = null;

        EObject this_DOWN_5 = null;

        EObject this_LEFT_6 = null;

        EObject this_RIGHT_7 = null;

        EObject this_FORWARD_8 = null;

        EObject this_BACKWARD_9 = null;

        EObject this_ROTATE_10 = null;



        	enterRule();

        try {
            // InternalXDrone.g:189:2: ( ( ( () ruleHOME ) | ( () ruleEMERGENCY ) | this_UP_4= ruleUP | this_DOWN_5= ruleDOWN | this_LEFT_6= ruleLEFT | this_RIGHT_7= ruleRIGHT | this_FORWARD_8= ruleFORWARD | this_BACKWARD_9= ruleBACKWARD | this_ROTATE_10= ruleROTATE ) )
            // InternalXDrone.g:190:2: ( ( () ruleHOME ) | ( () ruleEMERGENCY ) | this_UP_4= ruleUP | this_DOWN_5= ruleDOWN | this_LEFT_6= ruleLEFT | this_RIGHT_7= ruleRIGHT | this_FORWARD_8= ruleFORWARD | this_BACKWARD_9= ruleBACKWARD | this_ROTATE_10= ruleROTATE )
            {
            // InternalXDrone.g:190:2: ( ( () ruleHOME ) | ( () ruleEMERGENCY ) | this_UP_4= ruleUP | this_DOWN_5= ruleDOWN | this_LEFT_6= ruleLEFT | this_RIGHT_7= ruleRIGHT | this_FORWARD_8= ruleFORWARD | this_BACKWARD_9= ruleBACKWARD | this_ROTATE_10= ruleROTATE )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 23:
                {
                alt3=7;
                }
                break;
            case 24:
                {
                alt3=8;
                }
                break;
            case 25:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:191:3: ( () ruleHOME )
                    {
                    // InternalXDrone.g:191:3: ( () ruleHOME )
                    // InternalXDrone.g:192:4: () ruleHOME
                    {
                    // InternalXDrone.g:192:4: ()
                    // InternalXDrone.g:193:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getHOMEParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleHOME();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:208:3: ( () ruleEMERGENCY )
                    {
                    // InternalXDrone.g:208:3: ( () ruleEMERGENCY )
                    // InternalXDrone.g:209:4: () ruleEMERGENCY
                    {
                    // InternalXDrone.g:209:4: ()
                    // InternalXDrone.g:210:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getEMERGENCYParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEMERGENCY();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:225:3: this_UP_4= ruleUP
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UP_4=ruleUP();

                    state._fsp--;


                    			current = this_UP_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:234:3: this_DOWN_5= ruleDOWN
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDOWNParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOWN_5=ruleDOWN();

                    state._fsp--;


                    			current = this_DOWN_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXDrone.g:243:3: this_LEFT_6= ruleLEFT
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLEFTParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LEFT_6=ruleLEFT();

                    state._fsp--;


                    			current = this_LEFT_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXDrone.g:252:3: this_RIGHT_7= ruleRIGHT
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRIGHTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RIGHT_7=ruleRIGHT();

                    state._fsp--;


                    			current = this_RIGHT_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXDrone.g:261:3: this_FORWARD_8= ruleFORWARD
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFORWARDParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FORWARD_8=ruleFORWARD();

                    state._fsp--;


                    			current = this_FORWARD_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXDrone.g:270:3: this_BACKWARD_9= ruleBACKWARD
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBACKWARDParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BACKWARD_9=ruleBACKWARD();

                    state._fsp--;


                    			current = this_BACKWARD_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXDrone.g:279:3: this_ROTATE_10= ruleROTATE
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getROTATEParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ROTATE_10=ruleROTATE();

                    state._fsp--;


                    			current = this_ROTATE_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleHOME"
    // InternalXDrone.g:291:1: entryRuleHOME returns [String current=null] : iv_ruleHOME= ruleHOME EOF ;
    public final String entryRuleHOME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHOME = null;


        try {
            // InternalXDrone.g:291:44: (iv_ruleHOME= ruleHOME EOF )
            // InternalXDrone.g:292:2: iv_ruleHOME= ruleHOME EOF
            {
             newCompositeNode(grammarAccess.getHOMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHOME=ruleHOME();

            state._fsp--;

             current =iv_ruleHOME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHOME"


    // $ANTLR start "ruleHOME"
    // InternalXDrone.g:298:1: ruleHOME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'home' ;
    public final AntlrDatatypeRuleToken ruleHOME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:304:2: (kw= 'home' )
            // InternalXDrone.g:305:2: kw= 'home'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getHOMEAccess().getHomeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHOME"


    // $ANTLR start "entryRuleEMERGENCY"
    // InternalXDrone.g:313:1: entryRuleEMERGENCY returns [String current=null] : iv_ruleEMERGENCY= ruleEMERGENCY EOF ;
    public final String entryRuleEMERGENCY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMERGENCY = null;


        try {
            // InternalXDrone.g:313:49: (iv_ruleEMERGENCY= ruleEMERGENCY EOF )
            // InternalXDrone.g:314:2: iv_ruleEMERGENCY= ruleEMERGENCY EOF
            {
             newCompositeNode(grammarAccess.getEMERGENCYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMERGENCY=ruleEMERGENCY();

            state._fsp--;

             current =iv_ruleEMERGENCY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMERGENCY"


    // $ANTLR start "ruleEMERGENCY"
    // InternalXDrone.g:320:1: ruleEMERGENCY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'emergencyStop' ;
    public final AntlrDatatypeRuleToken ruleEMERGENCY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:326:2: (kw= 'emergencyStop' )
            // InternalXDrone.g:327:2: kw= 'emergencyStop'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEMERGENCYAccess().getEmergencyStopKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMERGENCY"


    // $ANTLR start "entryRuleUP"
    // InternalXDrone.g:335:1: entryRuleUP returns [EObject current=null] : iv_ruleUP= ruleUP EOF ;
    public final EObject entryRuleUP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUP = null;


        try {
            // InternalXDrone.g:335:43: (iv_ruleUP= ruleUP EOF )
            // InternalXDrone.g:336:2: iv_ruleUP= ruleUP EOF
            {
             newCompositeNode(grammarAccess.getUPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUP=ruleUP();

            state._fsp--;

             current =iv_ruleUP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUP"


    // $ANTLR start "ruleUP"
    // InternalXDrone.g:342:1: ruleUP returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleUP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:348:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:349:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:349:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:350:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUPAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUPAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:358:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:359:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:359:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:360:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getUPAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUPAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUP"


    // $ANTLR start "entryRuleDOWN"
    // InternalXDrone.g:384:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // InternalXDrone.g:384:45: (iv_ruleDOWN= ruleDOWN EOF )
            // InternalXDrone.g:385:2: iv_ruleDOWN= ruleDOWN EOF
            {
             newCompositeNode(grammarAccess.getDOWNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOWN=ruleDOWN();

            state._fsp--;

             current =iv_ruleDOWN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOWN"


    // $ANTLR start "ruleDOWN"
    // InternalXDrone.g:391:1: ruleDOWN returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleDOWN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:397:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:398:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:398:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:399:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDOWNAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDOWNAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:407:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:408:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:408:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:409:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getDOWNAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDOWNAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOWN"


    // $ANTLR start "entryRuleLEFT"
    // InternalXDrone.g:433:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalXDrone.g:433:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalXDrone.g:434:2: iv_ruleLEFT= ruleLEFT EOF
            {
             newCompositeNode(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEFT=ruleLEFT();

            state._fsp--;

             current =iv_ruleLEFT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // InternalXDrone.g:440:1: ruleLEFT returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleLEFT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:446:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:447:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:447:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:448:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLEFTAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLEFTAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:456:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:457:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:457:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:458:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getLEFTAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLEFTAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "entryRuleRIGHT"
    // InternalXDrone.g:482:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalXDrone.g:482:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalXDrone.g:483:2: iv_ruleRIGHT= ruleRIGHT EOF
            {
             newCompositeNode(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRIGHT=ruleRIGHT();

            state._fsp--;

             current =iv_ruleRIGHT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // InternalXDrone.g:489:1: ruleRIGHT returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRIGHT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:495:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:496:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:496:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:497:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRIGHTAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRIGHTAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:505:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:506:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:506:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:507:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getRIGHTAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRIGHTAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleFORWARD"
    // InternalXDrone.g:531:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // InternalXDrone.g:531:48: (iv_ruleFORWARD= ruleFORWARD EOF )
            // InternalXDrone.g:532:2: iv_ruleFORWARD= ruleFORWARD EOF
            {
             newCompositeNode(grammarAccess.getFORWARDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORWARD=ruleFORWARD();

            state._fsp--;

             current =iv_ruleFORWARD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFORWARD"


    // $ANTLR start "ruleFORWARD"
    // InternalXDrone.g:538:1: ruleFORWARD returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleFORWARD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:544:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:545:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:545:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:546:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFORWARDAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFORWARDAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:554:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:555:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:555:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:556:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getFORWARDAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFORWARDAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFORWARD"


    // $ANTLR start "entryRuleBACKWARD"
    // InternalXDrone.g:580:1: entryRuleBACKWARD returns [EObject current=null] : iv_ruleBACKWARD= ruleBACKWARD EOF ;
    public final EObject entryRuleBACKWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBACKWARD = null;


        try {
            // InternalXDrone.g:580:49: (iv_ruleBACKWARD= ruleBACKWARD EOF )
            // InternalXDrone.g:581:2: iv_ruleBACKWARD= ruleBACKWARD EOF
            {
             newCompositeNode(grammarAccess.getBACKWARDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBACKWARD=ruleBACKWARD();

            state._fsp--;

             current =iv_ruleBACKWARD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBACKWARD"


    // $ANTLR start "ruleBACKWARD"
    // InternalXDrone.g:587:1: ruleBACKWARD returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleBACKWARD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:593:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:594:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:594:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:595:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBACKWARDAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBACKWARDAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:603:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:604:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:604:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:605:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getBACKWARDAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBACKWARDAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBACKWARD"


    // $ANTLR start "entryRuleROTATE"
    // InternalXDrone.g:629:1: entryRuleROTATE returns [EObject current=null] : iv_ruleROTATE= ruleROTATE EOF ;
    public final EObject entryRuleROTATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleROTATE = null;


        try {
            // InternalXDrone.g:629:47: (iv_ruleROTATE= ruleROTATE EOF )
            // InternalXDrone.g:630:2: iv_ruleROTATE= ruleROTATE EOF
            {
             newCompositeNode(grammarAccess.getROTATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleROTATE=ruleROTATE();

            state._fsp--;

             current =iv_ruleROTATE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleROTATE"


    // $ANTLR start "ruleROTATE"
    // InternalXDrone.g:636:1: ruleROTATE returns [EObject current=null] : (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_degrees_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleROTATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_degrees_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:642:2: ( (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_degrees_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:643:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_degrees_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:643:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_degrees_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:644:3: otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_degrees_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getROTATEAccess().getROTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getROTATEAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:652:3: ( (lv_degrees_2_0= RULE_INT ) )
            // InternalXDrone.g:653:4: (lv_degrees_2_0= RULE_INT )
            {
            // InternalXDrone.g:653:4: (lv_degrees_2_0= RULE_INT )
            // InternalXDrone.g:654:5: lv_degrees_2_0= RULE_INT
            {
            lv_degrees_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_degrees_2_0, grammarAccess.getROTATEAccess().getDegreesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getROTATERule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getROTATEAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleROTATE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003F3C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003F3E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}