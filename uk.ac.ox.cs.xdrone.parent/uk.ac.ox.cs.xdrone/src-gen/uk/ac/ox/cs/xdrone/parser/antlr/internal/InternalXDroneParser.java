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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xdrone'", "'begin'", "';'", "'end'", "'TAKEOFF'", "'LAND'", "'UP'", "'('", "')'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'"
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
    public static final int T__26=26;
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

                if ( ((LA2_0>=15 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=26)) ) {
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
    // InternalXDrone.g:183:1: ruleCommand returns [EObject current=null] : ( ( () ruleTakeoff ) | ( () ruleLand ) | this_Up_4= ruleUp | this_Down_5= ruleDown | this_Left_6= ruleLeft | this_Right_7= ruleRight | this_Forward_8= ruleForward | this_Backward_9= ruleBackward | this_RotateL_10= ruleRotateL | this_RotateR_11= ruleRotateR ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Up_4 = null;

        EObject this_Down_5 = null;

        EObject this_Left_6 = null;

        EObject this_Right_7 = null;

        EObject this_Forward_8 = null;

        EObject this_Backward_9 = null;

        EObject this_RotateL_10 = null;

        EObject this_RotateR_11 = null;



        	enterRule();

        try {
            // InternalXDrone.g:189:2: ( ( ( () ruleTakeoff ) | ( () ruleLand ) | this_Up_4= ruleUp | this_Down_5= ruleDown | this_Left_6= ruleLeft | this_Right_7= ruleRight | this_Forward_8= ruleForward | this_Backward_9= ruleBackward | this_RotateL_10= ruleRotateL | this_RotateR_11= ruleRotateR ) )
            // InternalXDrone.g:190:2: ( ( () ruleTakeoff ) | ( () ruleLand ) | this_Up_4= ruleUp | this_Down_5= ruleDown | this_Left_6= ruleLeft | this_Right_7= ruleRight | this_Forward_8= ruleForward | this_Backward_9= ruleBackward | this_RotateL_10= ruleRotateL | this_RotateR_11= ruleRotateR )
            {
            // InternalXDrone.g:190:2: ( ( () ruleTakeoff ) | ( () ruleLand ) | this_Up_4= ruleUp | this_Down_5= ruleDown | this_Left_6= ruleLeft | this_Right_7= ruleRight | this_Forward_8= ruleForward | this_Backward_9= ruleBackward | this_RotateL_10= ruleRotateL | this_RotateR_11= ruleRotateR )
            int alt3=10;
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
            case 26:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:191:3: ( () ruleTakeoff )
                    {
                    // InternalXDrone.g:191:3: ( () ruleTakeoff )
                    // InternalXDrone.g:192:4: () ruleTakeoff
                    {
                    // InternalXDrone.g:192:4: ()
                    // InternalXDrone.g:193:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getTakeoffParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleTakeoff();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:208:3: ( () ruleLand )
                    {
                    // InternalXDrone.g:208:3: ( () ruleLand )
                    // InternalXDrone.g:209:4: () ruleLand
                    {
                    // InternalXDrone.g:209:4: ()
                    // InternalXDrone.g:210:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getLandParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLand();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:225:3: this_Up_4= ruleUp
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Up_4=ruleUp();

                    state._fsp--;


                    			current = this_Up_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:234:3: this_Down_5= ruleDown
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDownParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Down_5=ruleDown();

                    state._fsp--;


                    			current = this_Down_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXDrone.g:243:3: this_Left_6= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLeftParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_6=ruleLeft();

                    state._fsp--;


                    			current = this_Left_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXDrone.g:252:3: this_Right_7= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRightParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_7=ruleRight();

                    state._fsp--;


                    			current = this_Right_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXDrone.g:261:3: this_Forward_8= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_8=ruleForward();

                    state._fsp--;


                    			current = this_Forward_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXDrone.g:270:3: this_Backward_9= ruleBackward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBackwardParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Backward_9=ruleBackward();

                    state._fsp--;


                    			current = this_Backward_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXDrone.g:279:3: this_RotateL_10= ruleRotateL
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateLParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateL_10=ruleRotateL();

                    state._fsp--;


                    			current = this_RotateL_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalXDrone.g:288:3: this_RotateR_11= ruleRotateR
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateRParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateR_11=ruleRotateR();

                    state._fsp--;


                    			current = this_RotateR_11;
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


    // $ANTLR start "entryRuleTakeoff"
    // InternalXDrone.g:300:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:300:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:301:2: iv_ruleTakeoff= ruleTakeoff EOF
            {
             newCompositeNode(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakeoff=ruleTakeoff();

            state._fsp--;

             current =iv_ruleTakeoff.getText(); 
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
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalXDrone.g:307:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TAKEOFF' ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:313:2: (kw= 'TAKEOFF' )
            // InternalXDrone.g:314:2: kw= 'TAKEOFF'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTakeoffAccess().getTAKEOFFKeyword());
            	

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
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:322:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:322:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:323:2: iv_ruleLand= ruleLand EOF
            {
             newCompositeNode(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLand=ruleLand();

            state._fsp--;

             current =iv_ruleLand.getText(); 
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
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalXDrone.g:329:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAND' ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:335:2: (kw= 'LAND' )
            // InternalXDrone.g:336:2: kw= 'LAND'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLandAccess().getLANDKeyword());
            	

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
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:344:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:344:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:345:2: iv_ruleUp= ruleUp EOF
            {
             newCompositeNode(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUp=ruleUp();

            state._fsp--;

             current =iv_ruleUp; 
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
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalXDrone.g:351:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:357:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:358:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:358:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:359:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:367:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:368:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:368:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:369:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getUpAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUpAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleUp"


    // $ANTLR start "entryRuleDown"
    // InternalXDrone.g:393:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:393:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:394:2: iv_ruleDown= ruleDown EOF
            {
             newCompositeNode(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDown=ruleDown();

            state._fsp--;

             current =iv_ruleDown; 
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
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalXDrone.g:400:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:406:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:407:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:407:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:408:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:416:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:417:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:417:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:418:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getDownAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDownAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:442:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:442:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:443:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalXDrone.g:449:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:455:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:456:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:456:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:457:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:465:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:466:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:466:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:467:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getLeftAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:491:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:491:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:492:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalXDrone.g:498:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:504:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:505:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:505:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:506:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:514:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:515:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:515:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:516:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getRightAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRightAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleForward"
    // InternalXDrone.g:540:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:540:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:541:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalXDrone.g:547:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:553:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:554:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:554:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:555:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:563:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:564:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:564:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:565:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getForwardAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalXDrone.g:589:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:589:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:590:2: iv_ruleBackward= ruleBackward EOF
            {
             newCompositeNode(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackward=ruleBackward();

            state._fsp--;

             current =iv_ruleBackward; 
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
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalXDrone.g:596:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:602:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:603:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:603:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:604:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:612:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:613:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:613:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:614:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getBackwardAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:638:1: entryRuleRotateL returns [EObject current=null] : iv_ruleRotateL= ruleRotateL EOF ;
    public final EObject entryRuleRotateL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateL = null;


        try {
            // InternalXDrone.g:638:48: (iv_ruleRotateL= ruleRotateL EOF )
            // InternalXDrone.g:639:2: iv_ruleRotateL= ruleRotateL EOF
            {
             newCompositeNode(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateL=ruleRotateL();

            state._fsp--;

             current =iv_ruleRotateL; 
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
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalXDrone.g:645:1: ruleRotateL returns [EObject current=null] : (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:651:2: ( (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:652:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:652:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:653:3: otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:661:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:662:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:662:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:663:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getRotateLAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalXDrone.g:687:1: entryRuleRotateR returns [EObject current=null] : iv_ruleRotateR= ruleRotateR EOF ;
    public final EObject entryRuleRotateR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateR = null;


        try {
            // InternalXDrone.g:687:48: (iv_ruleRotateR= ruleRotateR EOF )
            // InternalXDrone.g:688:2: iv_ruleRotateR= ruleRotateR EOF
            {
             newCompositeNode(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateR=ruleRotateR();

            state._fsp--;

             current =iv_ruleRotateR; 
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
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalXDrone.g:694:1: ruleRotateR returns [EObject current=null] : (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_milliseconds_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:700:2: ( (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:701:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:701:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:702:3: otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_milliseconds_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:710:3: ( (lv_milliseconds_2_0= RULE_INT ) )
            // InternalXDrone.g:711:4: (lv_milliseconds_2_0= RULE_INT )
            {
            // InternalXDrone.g:711:4: (lv_milliseconds_2_0= RULE_INT )
            // InternalXDrone.g:712:5: lv_milliseconds_2_0= RULE_INT
            {
            lv_milliseconds_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_milliseconds_2_0, grammarAccess.getRotateRAccess().getMillisecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRotateR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007F3C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F3E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}