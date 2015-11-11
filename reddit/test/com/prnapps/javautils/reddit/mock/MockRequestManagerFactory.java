package com.prnapps.javautils.reddit.mock;

import com.prnapps.javautils.http.HttpException;
import com.prnapps.javautils.http.HttpResponse;
import com.prnapps.javautils.reddit.api.endpoints.interfaces.IRequest;

import java.io.IOException;

/**
 * Created by jimbo on 3/23/2015.
 */
public class MockRequestManagerFactory {

    public IRequest getMockLoginSavedManager() {
        return new IRequest() {
            @Override
            public HttpResponse request() throws HttpException, IOException {
                return new HttpResponse()
                        .setStatusCode(200)
                        .setResponseBody("{\"json\": {\"errors\": [[\"WRONG_PASSWORD\", \"invalid password\", \"passwd\"]], \"data\": {\"need_https\": false, \"modhash\": \"bc5i88sviw4e0fdd5189025237c2c849f30920e3cc00d35841\", \"cookie\": \"8013673,2014-09-21T08:01:05,2c32f28703501a9f72a838d7b245f4f157b8d45e\"}}}");
            }
        };
    }

    public IRequest getMockSavedRequestManager() {
        return new IRequest() {
            @Override
            public HttpResponse request() throws HttpException, IOException {
                return new HttpResponse()
                        .setStatusCode(200)
                        .setResponseBody("{\"kind\":\"Listing\",\"data\":{\"modhash\":\"ofo4hr3oie1f6be504d4e04d657a4ec0b81f80c7b83a6907b1\",\"children\":[{\"kind\":\"t1\",\"data\":{\"subreddit_id\":\"t5_2qoil\",\"link_title\":\"Hue hue hue\",\"banned_by\":null,\"link_id\":\"t3_2hln8c\",\"link_author\":\"PingasPanther\",\"likes\":null,\"replies\":null,\"user_reports\":[],\"saved\":true,\"id\":\"cktsrh3\",\"gilded\":0,\"report_reasons\":null,\"author\":\"PingasPanther\",\"parent_id\":\"t3_2hln8c\",\"score\":24,\"approved_by\":null,\"controversiality\":0,\"body\":\"Album\\n\\nhttp://Imgur.com/a/OmHT8\",\"edited\":false,\"author_flair_css_class\":null,\"downs\":0,\"body_html\":\"&lt;div class=\\\"md\\\"&gt;&lt;p&gt;Album&lt;/p&gt;\\n\\n&lt;p&gt;&lt;a href=\\\"http://Imgur.com/a/OmHT8\\\"&gt;http://Imgur.com/a/OmHT8&lt;/a&gt;&lt;/p&gt;\\n&lt;/div&gt;\",\"subreddit\":\"ass\",\"score_hidden\":false,\"name\":\"t1_cktsrh3\",\"created\":1411833134,\"author_flair_text\":null,\"link_url\":\"http://imgur.com/FAQx5EX.jpg\",\"created_utc\":1411804334,\"ups\":24,\"mod_reports\":[],\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"chirb.it\",\"banned_by\":null,\"media_embed\":{\"content\":\"&lt;iframe class=\\\"embedly-embed\\\" src=\\\"//cdn.embedly.com/widgets/media.html?src=http%3A%2F%2Fchirb.it%2Fwp%2Fk7am7t&amp;src_secure=1&amp;url=http%3A%2F%2Fchirb.it%2Fk7am7t&amp;image=http%3A%2F%2Fchirb.it%2Fchirbit_oembedpic.jpg&amp;key=2aa3c4d5f3de4f5b9120b660ad850dc9&amp;type=text%2Fhtml&amp;schema=chirb\\\" width=\\\"380\\\" height=\\\"120\\\" scrolling=\\\"no\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\",\"width\":380,\"scrolling\":false,\"height\":120},\"subreddit\":\"gonewildaudio\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"2hlntm\",\"gilded\":1,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"Pippits\",\"media\":{\"type\":\"chirb.it\",\"oembed\":{\"provider_url\":\"http://www.chirbit.com/\",\"description\":\"Audio: The name's Satan, but you can call me lucy Ideal woman contract, fuck my infernal pussy, lucy has feelings - social audio\",\"title\":\"The name&amp;#39;s Satan, but you can call me lucy\",\"thumbnail_width\":120,\"height\":120,\"width\":380,\"html\":\"&lt;iframe class=\\\"embedly-embed\\\" src=\\\"//cdn.embedly.com/widgets/media.html?src=http%3A%2F%2Fchirb.it%2Fwp%2Fk7am7t&amp;src_secure=1&amp;url=http%3A%2F%2Fchirb.it%2Fk7am7t&amp;image=http%3A%2F%2Fchirb.it%2Fchirbit_oembedpic.jpg&amp;key=2aa3c4d5f3de4f5b9120b660ad850dc9&amp;type=text%2Fhtml&amp;schema=chirb\\\" width=\\\"380\\\" height=\\\"120\\\" scrolling=\\\"no\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\",\"author_name\":\"Pip\",\"version\":\"1.0\",\"provider_name\":\"chirbit\",\"thumbnail_url\":\"http://chirb.it/chirbit_oembedpic.jpg\",\"type\":\"rich\",\"thumbnail_height\":120,\"author_url\":\"http://www.chirbit.com/Pip\"}},\"score\":29,\"approved_by\":null,\"over_18\":true,\"hidden\":false,\"thumbnail\":\"http://b.thumbs.redditmedia.com/ML21HfrMbTnYyoSoUVlpPF_xR2PnfEXhCmmHqxtBmHU.jpg\",\"subreddit_id\":\"t5_2u463\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":\"verifyblackpink\",\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":false,\"name\":\"t3_2hlntm\",\"permalink\":\"/r/gonewildaudio/comments/2hlntm/f4m_the_names_satan_but_you_can_call_me_lucy/\",\"stickied\":false,\"created\":1411833792,\"url\":\"http://chirb.it/k7am7t\",\"author_flair_text\":\"Verified!\",\"title\":\"[F4M] The name's Satan but you can call me lucy [Humor] [2 voices] [Ideal woman contract] [Fuck my infernal pussy] [Satan doesn't give a shit!] [Wait maybe I do] [Script by /u/homersoc]\",\"created_utc\":1411804992,\"ups\":29,\"num_comments\":29,\"visited\":false,\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"soundgasm.net\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"gonewildaudio\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"2hl48m\",\"gilded\":0,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"Cuddly_Bear_\",\"media\":null,\"score\":8,\"approved_by\":null,\"over_18\":true,\"hidden\":false,\"thumbnail\":\"default\",\"subreddit_id\":\"t5_2u463\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":\"verifyblackblue\",\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":false,\"name\":\"t3_2hl48m\",\"permalink\":\"/r/gonewildaudio/comments/2hl48m/m4f_this_is_what_my_voice_does_to_you/\",\"stickied\":false,\"created\":1411815182,\"url\":\"http://soundgasm.net/u/Cuddly_Bear_/GWA-What-my-voice-does-to-you\",\"author_flair_text\":\"Verified!\",\"title\":\"[M4F] This is what my voice does to you [Sweet][Sexy][Dirty talk][cum for me]\",\"created_utc\":1411786382,\"ups\":8,\"num_comments\":13,\"visited\":false,\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"self.gonewildaudio\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"gonewildaudio\",\"selftext_html\":\"&lt;!-- SC_OFF --&gt;&lt;div class=\\\"md\\\"&gt;&lt;p&gt;Have you ever &lt;a href=\\\"http://soundgasm.net/u/eves-garden/I-want-you\\\"&gt;wanted someone&lt;/a&gt; so badly that you could feel it, burning, aching to request free, possessing you so thoroughly that you could barely breathe? &lt;/p&gt;\\n&lt;/div&gt;&lt;!-- SC_ON --&gt;\",\"selftext\":\"Have you ever [wanted someone](http://soundgasm.net/u/eves-garden/I-want-you) so badly that you could feel it, burning, aching to request free, possessing you so thoroughly that you could barely breathe? \",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"2hlree\",\"gilded\":0,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"Eves-garden\",\"media\":null,\"score\":37,\"approved_by\":null,\"over_18\":true,\"hidden\":false,\"thumbnail\":\"self\",\"subreddit_id\":\"t5_2u463\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":\"verifyblackpink\",\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":true,\"name\":\"t3_2hlree\",\"permalink\":\"/r/gonewildaudio/comments/2hlree/f4m_i_want_youpassiondesirewanting_and_yearning/\",\"stickied\":false,\"created\":1411838494,\"url\":\"http://www.reddit.com/r/gonewildaudio/comments/2hlree/f4m_i_want_youpassiondesirewanting_and_yearning/\",\"author_flair_text\":\"Verified!\",\"title\":\"[f4m] I want you...[passion][desire][wanting and yearning, longing and lust and love]\",\"created_utc\":1411809694,\"ups\":37,\"num_comments\":33,\"visited\":false,\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"imgur.com\",\"banned_by\":null,\"media_embed\":{\"content\":\"&lt;iframe class=\\\"embedly-embed\\\" src=\\\"//cdn.embedly.com/widgets/media.html?src=http%3A%2F%2Fimgur.com%2Fa%2FL2VvW%2Fembed&amp;url=http%3A%2F%2Fimgur.com%2Fa%2FL2VvW&amp;image=http%3A%2F%2Fi.imgur.com%2FNAYDvqr.jpg&amp;key=2aa3c4d5f3de4f5b9120b660ad850dc9&amp;type=text%2Fhtml&amp;schema=imgur\\\" width=\\\"550\\\" height=\\\"550\\\" scrolling=\\\"no\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\",\"width\":550,\"scrolling\":false,\"height\":550},\"subreddit\":\"damselsindistress\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"2f7g56\",\"gilded\":0,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"superstander\",\"media\":{\"oembed\":{\"provider_url\":\"http://imgur.com\",\"description\":\"The most viral images on the internet, curated in real time by a dedicated community through commenting, voting and sharing.\",\"title\":\"imgur: the simple image sharer\",\"type\":\"rich\",\"thumbnail_width\":825,\"height\":550,\"width\":550,\"html\":\"&lt;iframe class=\\\"embedly-embed\\\" src=\\\"//cdn.embedly.com/widgets/media.html?src=http%3A%2F%2Fimgur.com%2Fa%2FL2VvW%2Fembed&amp;url=http%3A%2F%2Fimgur.com%2Fa%2FL2VvW&amp;image=http%3A%2F%2Fi.imgur.com%2FNAYDvqr.jpg&amp;key=2aa3c4d5f3de4f5b9120b660ad850dc9&amp;type=text%2Fhtml&amp;schema=imgur\\\" width=\\\"550\\\" height=\\\"550\\\" scrolling=\\\"no\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\",\"version\":\"1.0\",\"provider_name\":\"Imgur\",\"thumbnail_url\":\"http://i.imgur.com/NAYDvqr.jpg\",\"thumbnail_height\":598},\"type\":\"imgur.com\"},\"score\":91,\"approved_by\":null,\"over_18\":true,\"hidden\":false,\"thumbnail\":\"http://a.thumbs.redditmedia.com/H5OYWY2DflRn9Y93mF0EWImnNDR3LDuICOWble96C84.jpg\",\"subreddit_id\":\"t5_2wwqd\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":null,\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":false,\"name\":\"t3_2f7g56\",\"permalink\":\"/r/damselsindistress/comments/2f7g56/erin_avery_is_my_favorite_damsel_this_is_every/\",\"stickied\":false,\"created\":1409640207,\"url\":\"http://imgur.com/a/L2VvW#0\",\"author_flair_text\":null,\"title\":\"Erin Avery is my favorite damsel. This is every picture of her that I have. Please enjoy.\",\"created_utc\":1409611407,\"ups\":91,\"num_comments\":1,\"visited\":false,\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"self.changemyview\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"changemyview\",\"selftext_html\":\"&lt;!-- SC_OFF --&gt;&lt;div class=\\\"md\\\"&gt;&lt;p&gt;[removed]&lt;/p&gt;\\n&lt;/div&gt;&lt;!-- SC_ON --&gt;\",\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":\"Rule B\",\"id\":\"2fpyjp\",\"gilded\":0,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"tttrouble\",\"media\":null,\"score\":282,\"approved_by\":null,\"over_18\":false,\"hidden\":false,\"thumbnail\":\"default\",\"subreddit_id\":\"t5_2w2s8\",\"edited\":1410105291,\"link_flair_css_class\":\"\",\"author_flair_css_class\":null,\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":true,\"name\":\"t3_2fpyjp\",\"permalink\":\"/r/changemyview/comments/2fpyjp/cmv_child_porn_is_now_being_used_as_a_shield_to/\",\"stickied\":false,\"created\":1410129802,\"url\":\"http://www.reddit.com/r/changemyview/comments/2fpyjp/cmv_child_porn_is_now_being_used_as_a_shield_to/\",\"author_flair_text\":null,\"title\":\"CMV: \\\"Child Porn\\\" is now being used as a shield to limit unwanted and uncomfortable behavior with the guise of an invincible moral high ground\",\"created_utc\":1410101002,\"ups\":282,\"num_comments\":180,\"visited\":false,\"num_reports\":null,\"distinguished\":null}},{\"kind\":\"t3\",\"data\":{\"domain\":\"i.imgur.com\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"NSFW_GIF\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"2bh7ed\",\"gilded\":0,\"secure_media_embed\":{},\"clicked\":false,\"report_reasons\":null,\"author\":\"itwasntme19\",\"media\":null,\"score\":1861,\"approved_by\":null,\"over_18\":true,\"hidden\":false,\"thumbnail\":\"http://a.thumbs.redditmedia.com/ZLIkjMaiT8Y79BLz.jpg\",\"subreddit_id\":\"t5_2rm76\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":null,\"downs\":0,\"mod_reports\":[],\"saved\":true,\"is_self\":false,\"name\":\"t3_2bh7ed\",\"permalink\":\"/r/NSFW_GIF/comments/2bh7ed/deep_throat_mystery_solved/\",\"stickied\":false,\"created\":1406131164,\"url\":\"http://i.imgur.com/yGxCoBA.gif\",\"author_flair_text\":null,\"title\":\"deep throat mystery solved\",\"created_utc\":1406102364,\"ups\":1861,\"num_comments\":48,\"visited\":false,\"num_reports\":null,\"distinguished\":null}}],\"after\":null,\"before\":null}}");
            }
        };
    }

    public IRequest getMockSubredditRequestManager() {
        return new IRequest() {
            @Override
            public HttpResponse request() throws HttpException, IOException {
                return new HttpResponse()
                        .setStatusCode(200)
                        .setResponseBody("{\"kind\":\"Listing\",\"data\":{\"modhash\":\"\",\"children\":[{\"kind\":\"t3\",\"data\":{\"domain\":\"imgur.com\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"funny\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"306mgo\",\"gilded\":0,\"archived\":false,\"clicked\":false,\"report_reasons\":null,\"author\":\"tsim12345\",\"num_comments\":256,\"score\":3815,\"approved_by\":null,\"over_18\":false,\"hidden\":false,\"thumbnail\":\"http://b.thumbs.redditmedia.com/1mwLONlUPzY7dmwvtp868D8Pq673AKiAPXuL_crz2vU.jpg\",\"subreddit_id\":\"t5_2qh33\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":null,\"downs\":0,\"secure_media_embed\":{},\"saved\":false,\"stickied\":false,\"is_self\":false,\"permalink\":\"/r/funny/comments/306mgo/brutal_but_fair/\",\"name\":\"t3_306mgo\",\"created\":1427264070,\"url\":\"http://imgur.com/jVZgGS6\",\"author_flair_text\":null,\"title\":\"Brutal, but fair.\",\"created_utc\":1427235270,\"distinguished\":null,\"media\":null,\"mod_reports\":[],\"visited\":false,\"num_reports\":null,\"ups\":3815}},{\"kind\":\"t3\",\"data\":{\"domain\":\"i.imgur.com\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"funny\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"3093fp\",\"gilded\":0,\"archived\":false,\"clicked\":false,\"report_reasons\":null,\"author\":\"snhvnc\",\"num_comments\":26,\"score\":195,\"approved_by\":null,\"over_18\":false,\"hidden\":false,\"thumbnail\":\"http://a.thumbs.redditmedia.com/nBTWuFU3k-WQs4BkeYH78iqgZwx7ysXWB0PisgJoo58.jpg\",\"subreddit_id\":\"t5_2qh33\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":null,\"downs\":0,\"secure_media_embed\":{},\"saved\":false,\"stickied\":false,\"is_self\":false,\"permalink\":\"/r/funny/comments/3093fp/going_from_playing_destiny_to_playing_bloodborne/\",\"name\":\"t3_3093fp\",\"created\":1427320787,\"url\":\"http://i.imgur.com/ERHFkwb.jpg\",\"author_flair_text\":null,\"title\":\"Going from playing Destiny to playing Bloodborne.\",\"created_utc\":1427291987,\"distinguished\":null,\"media\":null,\"mod_reports\":[],\"visited\":false,\"num_reports\":null,\"ups\":195}},{\"kind\":\"t3\",\"data\":{\"domain\":\"imgur.com\",\"banned_by\":null,\"media_embed\":{},\"subreddit\":\"funny\",\"selftext_html\":null,\"selftext\":\"\",\"likes\":null,\"user_reports\":[],\"secure_media\":null,\"link_flair_text\":null,\"id\":\"308nrm\",\"gilded\":0,\"archived\":false,\"clicked\":false,\"report_reasons\":null,\"author\":\"Chloechu\",\"num_comments\":7,\"score\":316,\"approved_by\":null,\"over_18\":false,\"hidden\":false,\"thumbnail\":\"http://b.thumbs.redditmedia.com/smlWi8eBC8zc96ECynDsRbuu9PW7TW19QX7acailPsg.jpg\",\"subreddit_id\":\"t5_2qh33\",\"edited\":false,\"link_flair_css_class\":null,\"author_flair_css_class\":null,\"downs\":0,\"secure_media_embed\":{},\"saved\":false,\"stickied\":false,\"is_self\":false,\"permalink\":\"/r/funny/comments/308nrm/well_it_sounds_logical_enough_to_me/\",\"name\":\"t3_308nrm\",\"created\":1427310295,\"url\":\"http://imgur.com/gallery/W8pEP\",\"author_flair_text\":null,\"title\":\"Well, it sounds logical enough to me!\",\"created_utc\":1427281495,\"distinguished\":null,\"media\":null,\"mod_reports\":[],\"visited\":false,\"num_reports\":null,\"ups\":316}}],\"after\":\"t3_308nrm\",\"before\":null}}");
            }
        };
    }

}
