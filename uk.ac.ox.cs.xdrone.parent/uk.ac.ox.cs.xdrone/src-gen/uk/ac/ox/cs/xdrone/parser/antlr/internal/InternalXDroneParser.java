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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fun'", "'input'", "'number'", "'main'", "'begin'", "';'", "'return'", "'end'", "'home'", "'emergencyStop'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalXDrone.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_subPrograms_0_0= ruleFun ) )* ( (lv_main_1_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_subPrograms_0_0 = null;

        EObject lv_main_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:77:2: ( ( ( (lv_subPrograms_0_0= ruleFun ) )* ( (lv_main_1_0= ruleMain ) ) ) )
            // InternalXDrone.g:78:2: ( ( (lv_subPrograms_0_0= ruleFun ) )* ( (lv_main_1_0= ruleMain ) ) )
            {
            // InternalXDrone.g:78:2: ( ( (lv_subPrograms_0_0= ruleFun ) )* ( (lv_main_1_0= ruleMain ) ) )
            // InternalXDrone.g:79:3: ( (lv_subPrograms_0_0= ruleFun ) )* ( (lv_main_1_0= ruleMain ) )
            {
            // InternalXDrone.g:79:3: ( (lv_subPrograms_0_0= ruleFun ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXDrone.g:80:4: (lv_subPrograms_0_0= ruleFun )
            	    {
            	    // InternalXDrone.g:80:4: (lv_subPrograms_0_0= ruleFun )
            	    // InternalXDrone.g:81:5: lv_subPrograms_0_0= ruleFun
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getSubProgramsFunParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_subPrograms_0_0=ruleFun();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subPrograms",
            	    						lv_subPrograms_0_0,
            	    						"uk.ac.ox.cs.xdrone.XDrone.Fun");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXDrone.g:98:3: ( (lv_main_1_0= ruleMain ) )
            // InternalXDrone.g:99:4: (lv_main_1_0= ruleMain )
            {
            // InternalXDrone.g:99:4: (lv_main_1_0= ruleMain )
            // InternalXDrone.g:100:5: lv_main_1_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_main_1_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_1_0,
            						"uk.ac.ox.cs.xdrone.XDrone.Main");
            					afterParserOrEnumRuleCall();
            				

            }


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


    // $ANTLR start "entryRuleFun"
    // InternalXDrone.g:121:1: entryRuleFun returns [EObject current=null] : iv_ruleFun= ruleFun EOF ;
    public final EObject entryRuleFun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFun = null;


        try {
            // InternalXDrone.g:121:44: (iv_ruleFun= ruleFun EOF )
            // InternalXDrone.g:122:2: iv_ruleFun= ruleFun EOF
            {
             newCompositeNode(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFun=ruleFun();

            state._fsp--;

             current =iv_ruleFun; 
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
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalXDrone.g:128:1: ruleFun returns [EObject current=null] : (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? ( (lv_body_4_0= ruleBody ) ) ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:134:2: ( (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? ( (lv_body_4_0= ruleBody ) ) ) )
            // InternalXDrone.g:135:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? ( (lv_body_4_0= ruleBody ) ) )
            {
            // InternalXDrone.g:135:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? ( (lv_body_4_0= ruleBody ) ) )
            // InternalXDrone.g:136:3: otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? ( (lv_body_4_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunAccess().getFunKeyword_0());
            		
            // InternalXDrone.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDrone.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDrone.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalXDrone.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXDrone.g:158:3: (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:159:4: otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunAccess().getInputKeyword_2_0());
                    			
                    // InternalXDrone.g:163:4: ( (lv_parameters_3_0= ruleParameter ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXDrone.g:164:5: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalXDrone.g:164:5: (lv_parameters_3_0= ruleParameter )
                    	    // InternalXDrone.g:165:6: lv_parameters_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getFunAccess().getParametersParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFunRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_3_0,
                    	    							"uk.ac.ox.cs.xdrone.XDrone.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXDrone.g:183:3: ( (lv_body_4_0= ruleBody ) )
            // InternalXDrone.g:184:4: (lv_body_4_0= ruleBody )
            {
            // InternalXDrone.g:184:4: (lv_body_4_0= ruleBody )
            // InternalXDrone.g:185:5: lv_body_4_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getFunAccess().getBodyBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"uk.ac.ox.cs.xdrone.XDrone.Body");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleParameter"
    // InternalXDrone.g:206:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXDrone.g:206:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXDrone.g:207:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXDrone.g:213:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:219:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) )
            // InternalXDrone.g:220:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalXDrone.g:220:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            // InternalXDrone.g:221:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) )
            {
            // InternalXDrone.g:221:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDrone.g:222:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:222:4: (lv_name_0_0= RULE_ID )
            // InternalXDrone.g:223:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXDrone.g:239:3: ( (lv_type_1_0= ruleType ) )
            // InternalXDrone.g:240:4: (lv_type_1_0= ruleType )
            {
            // InternalXDrone.g:240:4: (lv_type_1_0= ruleType )
            // InternalXDrone.g:241:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uk.ac.ox.cs.xdrone.XDrone.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalXDrone.g:262:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalXDrone.g:262:44: (iv_ruleType= ruleType EOF )
            // InternalXDrone.g:263:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalXDrone.g:269:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'number' ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:275:2: (kw= 'number' )
            // InternalXDrone.g:276:2: kw= 'number'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword());
            	

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:284:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalXDrone.g:284:45: (iv_ruleMain= ruleMain EOF )
            // InternalXDrone.g:285:2: iv_ruleMain= ruleMain EOF
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
    // InternalXDrone.g:291:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? otherlv_4= 'begin' ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )* (otherlv_7= 'return' ruleExpression )? otherlv_9= 'end' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        AntlrDatatypeRuleToken lv_expressions_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:297:2: ( (otherlv_0= 'main' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? otherlv_4= 'begin' ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )* (otherlv_7= 'return' ruleExpression )? otherlv_9= 'end' ) )
            // InternalXDrone.g:298:2: (otherlv_0= 'main' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? otherlv_4= 'begin' ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )* (otherlv_7= 'return' ruleExpression )? otherlv_9= 'end' )
            {
            // InternalXDrone.g:298:2: (otherlv_0= 'main' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? otherlv_4= 'begin' ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )* (otherlv_7= 'return' ruleExpression )? otherlv_9= 'end' )
            // InternalXDrone.g:299:3: otherlv_0= 'main' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )? otherlv_4= 'begin' ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )* (otherlv_7= 'return' ruleExpression )? otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            // InternalXDrone.g:303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDrone.g:304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDrone.g:304:4: (lv_name_1_0= RULE_ID )
            // InternalXDrone.g:305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalXDrone.g:321:3: (otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:322:4: otherlv_2= 'input' ( (lv_parameters_3_0= ruleParameter ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMainAccess().getInputKeyword_2_0());
                    			
                    // InternalXDrone.g:326:4: ( (lv_parameters_3_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXDrone.g:327:5: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalXDrone.g:327:5: (lv_parameters_3_0= ruleParameter )
                    	    // InternalXDrone.g:328:6: lv_parameters_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getMainAccess().getParametersParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMainRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_3_0,
                    	    							"uk.ac.ox.cs.xdrone.XDrone.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMainAccess().getBeginKeyword_3());
            		
            // InternalXDrone.g:350:3: ( ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:351:4: ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ';' )?
            	    {
            	    // InternalXDrone.g:351:4: ( (lv_expressions_5_0= ruleExpression ) )
            	    // InternalXDrone.g:352:5: (lv_expressions_5_0= ruleExpression )
            	    {
            	    // InternalXDrone.g:352:5: (lv_expressions_5_0= ruleExpression )
            	    // InternalXDrone.g:353:6: lv_expressions_5_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getExpressionsExpressionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_expressions_5_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_5_0,
            	    							"uk.ac.ox.cs.xdrone.XDrone.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalXDrone.g:370:4: (otherlv_6= ';' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==16) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalXDrone.g:371:5: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            	            					newLeafNode(otherlv_6, grammarAccess.getMainAccess().getSemicolonKeyword_4_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalXDrone.g:377:3: (otherlv_7= 'return' ruleExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDrone.g:378:4: otherlv_7= 'return' ruleExpression
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMainAccess().getReturnKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getMainAccess().getExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_12);
                    ruleExpression();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMainAccess().getEndKeyword_6());
            		

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


    // $ANTLR start "entryRuleBody"
    // InternalXDrone.g:398:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalXDrone.g:398:45: (iv_ruleBody= ruleBody EOF )
            // InternalXDrone.g:399:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalXDrone.g:405:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )* (otherlv_4= 'return' ruleExpression )? otherlv_6= 'end' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:411:2: ( ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )* (otherlv_4= 'return' ruleExpression )? otherlv_6= 'end' ) )
            // InternalXDrone.g:412:2: ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )* (otherlv_4= 'return' ruleExpression )? otherlv_6= 'end' )
            {
            // InternalXDrone.g:412:2: ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )* (otherlv_4= 'return' ruleExpression )? otherlv_6= 'end' )
            // InternalXDrone.g:413:3: () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )* (otherlv_4= 'return' ruleExpression )? otherlv_6= 'end'
            {
            // InternalXDrone.g:413:3: ()
            // InternalXDrone.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBlockExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBeginKeyword_1());
            		
            // InternalXDrone.g:424:3: ( ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXDrone.g:425:4: ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalXDrone.g:425:4: ( (lv_expressions_2_0= ruleExpression ) )
            	    // InternalXDrone.g:426:5: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalXDrone.g:426:5: (lv_expressions_2_0= ruleExpression )
            	    // InternalXDrone.g:427:6: lv_expressions_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"uk.ac.ox.cs.xdrone.XDrone.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalXDrone.g:444:4: (otherlv_3= ';' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==16) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalXDrone.g:445:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	            					newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getSemicolonKeyword_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalXDrone.g:451:3: (otherlv_4= 'return' ruleExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXDrone.g:452:4: otherlv_4= 'return' ruleExpression
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getReturnKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getBodyAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_12);
                    ruleExpression();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleExpression"
    // InternalXDrone.g:472:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalXDrone.g:472:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalXDrone.g:473:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalXDrone.g:479:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'home' | kw= 'emergencyStop' ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:485:2: ( (kw= 'home' | kw= 'emergencyStop' ) )
            // InternalXDrone.g:486:2: (kw= 'home' | kw= 'emergencyStop' )
            {
            // InternalXDrone.g:486:2: (kw= 'home' | kw= 'emergencyStop' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXDrone.g:487:3: kw= 'home'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getHomeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:493:3: kw= 'emergencyStop'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpressionAccess().getEmergencyStopKeyword_1());
                    		

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
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}