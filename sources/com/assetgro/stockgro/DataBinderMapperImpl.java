package com.assetgro.stockgro;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ba.Cdo;
import ba.a3;
import ba.a5;
import ba.a6;
import ba.a7;
import ba.a9;
import ba.aa;
import ba.ab;
import ba.ac;
import ba.ad;
import ba.af;
import ba.ag;
import ba.aj;
import ba.ak;
import ba.al;
import ba.ap;
import ba.at;
import ba.au;
import ba.av;
import ba.aw;
import ba.ax;
import ba.ay;
import ba.b;
import ba.b0;
import ba.b1;
import ba.b2;
import ba.b4;
import ba.b5;
import ba.b8;
import ba.ba;
import ba.be;
import ba.bf;
import ba.bh;
import ba.bi;
import ba.bj;
import ba.bm;
import ba.bn;
import ba.bo;
import ba.bp;
import ba.bq;
import ba.br;
import ba.bs;
import ba.bt;
import ba.bw;
import ba.bx;
import ba.c3;
import ba.c6;
import ba.c7;
import ba.c8;
import ba.c9;
import ba.cb;
import ba.cc;
import ba.cd;
import ba.cg;
import ba.ck;
import ba.cl;
import ba.cr;
import ba.ct;
import ba.cu;
import ba.cv;
import ba.cx;
import ba.cy;
import ba.d;
import ba.d0;
import ba.d1;
import ba.d2;
import ba.d4;
import ba.d5;
import ba.d8;
import ba.da;
import ba.de;
import ba.df;
import ba.dh;
import ba.di;
import ba.dj;
import ba.dm;
import ba.dn;
import ba.dp;
import ba.dq;
import ba.dr;
import ba.ds;
import ba.dt;
import ba.dv;
import ba.dw;
import ba.dy;
import ba.e3;
import ba.e6;
import ba.e7;
import ba.e9;
import ba.ea;
import ba.eb;
import ba.ec;
import ba.eg;
import ba.ej;
import ba.ek;
import ba.el;
import ba.er;
import ba.es;
import ba.et;
import ba.eu;
import ba.ev;
import ba.ew;
import ba.ex;
import ba.f;
import ba.f0;
import ba.f1;
import ba.f2;
import ba.f3;
import ba.f4;
import ba.f5;
import ba.f7;
import ba.f8;
import ba.fd;
import ba.fe;
import ba.ff;
import ba.fh;
import ba.fi;
import ba.fj;
import ba.fm;
import ba.fn;
import ba.fo;
import ba.fp;
import ba.fq;
import ba.fr;
import ba.fs;
import ba.fv;
import ba.g2;
import ba.g3;
import ba.g4;
import ba.g6;
import ba.g7;
import ba.g8;
import ba.g9;
import ba.ga;
import ba.gb;
import ba.gc;
import ba.gf;
import ba.gg;
import ba.gk;
import ba.gl;
import ba.gr;
import ba.gs;
import ba.gt;
import ba.gu;
import ba.gv;
import ba.gw;
import ba.gx;
import ba.gy;
import ba.h0;
import ba.h1;
import ba.h2;
import ba.h5;
import ba.hd;
import ba.he;
import ba.hf;
import ba.hh;
import ba.hi;
import ba.hj;
import ba.hl;
import ba.hm;
import ba.hn;
import ba.ho;
import ba.hp;
import ba.hq;
import ba.hr;
import ba.hs;
import ba.hu;
import ba.hv;
import ba.hw;
import ba.hx;
import ba.i3;
import ba.i4;
import ba.i6;
import ba.i7;
import ba.i8;
import ba.i9;
import ba.ia;
import ba.ib;
import ba.ic;
import ba.ig;
import ba.ik;
import ba.il;
import ba.im;
import ba.io;
import ba.iq;
import ba.ir;
import ba.is;
import ba.iu;
import ba.iw;
import ba.ix;
import ba.iy;
import ba.j;
import ba.j0;
import ba.j1;
import ba.j2;
import ba.j5;
import ba.jc;
import ba.jd;
import ba.je;
import ba.jf;
import ba.jg;
import ba.jh;
import ba.ji;
import ba.jj;
import ba.jm;
import ba.jn;
import ba.jp;
import ba.jq;
import ba.jr;
import ba.js;
import ba.jt;
import ba.jv;
import ba.jw;
import ba.jx;
import ba.k2;
import ba.k3;
import ba.k4;
import ba.k5;
import ba.k6;
import ba.k7;
import ba.k8;
import ba.k9;
import ba.ka;
import ba.kb;
import ba.kc;
import ba.kf;
import ba.kk;
import ba.kl;
import ba.ko;
import ba.kq;
import ba.kr;
import ba.ks;
import ba.ku;
import ba.kw;
import ba.kx;
import ba.ky;
import ba.l;
import ba.l0;
import ba.l1;
import ba.l2;
import ba.l4;
import ba.l7;
import ba.ld;
import ba.le;
import ba.lf;
import ba.lg;
import ba.lh;
import ba.li;
import ba.lj;
import ba.lm;
import ba.ln;
import ba.lp;
import ba.lq;
import ba.lt;
import ba.lv;
import ba.lw;
import ba.lx;
import ba.m2;
import ba.m3;
import ba.m5;
import ba.m6;
import ba.m7;
import ba.m8;
import ba.m9;
import ba.ma;
import ba.mb;
import ba.mc;
import ba.md;
import ba.me;
import ba.mf;
import ba.mk;
import ba.ml;
import ba.mm;
import ba.mo;
import ba.mr;
import ba.ms;
import ba.mt;
import ba.mu;
import ba.mv;
import ba.mw;
import ba.mx;
import ba.my;
import ba.n;
import ba.n0;
import ba.n1;
import ba.n2;
import ba.n4;
import ba.n7;
import ba.n8;
import ba.nd;
import ba.ne;
import ba.nf;
import ba.ng;
import ba.nh;
import ba.ni;
import ba.nj;
import ba.nm;
import ba.nn;
import ba.np;
import ba.nq;
import ba.nt;
import ba.nu;
import ba.nw;
import ba.o2;
import ba.o3;
import ba.o4;
import ba.o5;
import ba.o6;
import ba.o7;
import ba.o8;
import ba.o9;
import ba.oa;
import ba.ob;
import ba.oc;
import ba.oh;
import ba.oj;
import ba.ok;
import ba.ol;
import ba.om;
import ba.oo;
import ba.or;
import ba.os;
import ba.ot;
import ba.ou;
import ba.ov;
import ba.ow;
import ba.oy;
import ba.p;
import ba.p0;
import ba.p1;
import ba.p2;
import ba.p7;
import ba.pd;
import ba.pe;
import ba.pf;
import ba.pg;
import ba.pi;
import ba.pm;
import ba.pn;
import ba.po;
import ba.pp;
import ba.pq;
import ba.pr;
import ba.pt;
import ba.px;
import ba.q0;
import ba.q2;
import ba.q3;
import ba.q4;
import ba.q5;
import ba.q6;
import ba.q8;
import ba.q9;
import ba.qa;
import ba.qb;
import ba.qc;
import ba.qe;
import ba.qj;
import ba.qk;
import ba.ql;
import ba.qo;
import ba.qr;
import ba.qs;
import ba.qt;
import ba.qu;
import ba.qw;
import ba.r;
import ba.r0;
import ba.r1;
import ba.r2;
import ba.r7;
import ba.rb;
import ba.rd;
import ba.re;
import ba.rf;
import ba.rg;
import ba.rh;
import ba.ri;
import ba.rj;
import ba.rk;
import ba.rm;
import ba.rn;
import ba.rp;
import ba.rq;
import ba.rr;
import ba.rt;
import ba.ru;
import ba.rv;
import ba.rx;
import ba.s1;
import ba.s3;
import ba.s4;
import ba.s5;
import ba.s6;
import ba.s7;
import ba.s8;
import ba.s9;
import ba.sa;
import ba.sb;
import ba.sc;
import ba.sj;
import ba.sl;
import ba.sn;
import ba.so;
import ba.ss;
import ba.su;
import ba.sv;
import ba.sw;
import ba.sx;
import ba.t;
import ba.t0;
import ba.t1;
import ba.t2;
import ba.t7;
import ba.t9;
import ba.tb;
import ba.td;
import ba.te;
import ba.tf;
import ba.tg;
import ba.th;
import ba.ti;
import ba.tk;
import ba.tm;
import ba.tn;
import ba.tp;
import ba.tq;
import ba.tr;
import ba.tt;
import ba.tu;
import ba.tv;
import ba.u1;
import ba.u3;
import ba.u4;
import ba.u5;
import ba.u6;
import ba.u8;
import ba.u9;
import ba.ua;
import ba.ub;
import ba.uc;
import ba.uj;
import ba.uk;
import ba.ul;
import ba.uo;
import ba.ur;
import ba.us;
import ba.ut;
import ba.uu;
import ba.uv;
import ba.uw;
import ba.ux;
import ba.v;
import ba.v0;
import ba.v1;
import ba.v2;
import ba.v7;
import ba.vb;
import ba.vd;
import ba.ve;
import ba.vf;
import ba.vg;
import ba.vh;
import ba.vi;
import ba.vm;
import ba.vn;
import ba.vp;
import ba.vq;
import ba.vr;
import ba.vt;
import ba.vu;
import ba.vw;
import ba.w1;
import ba.w3;
import ba.w4;
import ba.w5;
import ba.w6;
import ba.w8;
import ba.w9;
import ba.wa;
import ba.wb;
import ba.wc;
import ba.wd;
import ba.we;
import ba.wh;
import ba.wj;
import ba.wk;
import ba.wl;
import ba.wo;
import ba.wr;
import ba.ws;
import ba.wt;
import ba.wu;
import ba.wv;
import ba.ww;
import ba.wx;
import ba.x;
import ba.x0;
import ba.x2;
import ba.x3;
import ba.x7;
import ba.xd;
import ba.xe;
import ba.xf;
import ba.xg;
import ba.xh;
import ba.xi;
import ba.xl;
import ba.xm;
import ba.xn;
import ba.xp;
import ba.xq;
import ba.xr;
import ba.xt;
import ba.xu;
import ba.xv;
import ba.y1;
import ba.y2;
import ba.y3;
import ba.y4;
import ba.y5;
import ba.y6;
import ba.y8;
import ba.y9;
import ba.ya;
import ba.yb;
import ba.yc;
import ba.yd;
import ba.ye;
import ba.yf;
import ba.yj;
import ba.yk;
import ba.yo;
import ba.yr;
import ba.ys;
import ba.yt;
import ba.yu;
import ba.yv;
import ba.yw;
import ba.yx;
import ba.z;
import ba.z0;
import ba.z1;
import ba.z3;
import ba.z7;
import ba.z9;
import ba.zd;
import ba.ze;
import ba.zg;
import ba.zh;
import ba.zi;
import ba.zl;
import ba.zm;
import ba.zn;
import ba.zp;
import ba.zq;
import ba.zr;
import ba.zt;
import ba.zv;
import ba.zw;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.data.TokenInvalidationInterceptor;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import com.assetgro.stockgro.widget.CrownImageView;
import com.assetgro.stockgro.widget.DisablePossibleNestedScrollView;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.NestedScrollWebView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.assetgro.stockgro.widget.StockChangeInfoBoldView;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import com.assetgro.stockgro.widget.TnCLinkView;
import com.assetgro.stockgro.widget.TouchDetectableScrollView;
import com.assetgro.stockgro.widget.stock_tag_edit_text.StockTagEditText;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import jr.h;
import m4.c;
import m4.m;
import me.relex.circleindicator.CircleIndicator2;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8558a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(481);
        f8558a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_add_friends_host, 1);
        sparseIntArray.put(R.layout.activity_add_members_host_compose, 2);
        sparseIntArray.put(R.layout.activity_app_about_section, 3);
        sparseIntArray.put(R.layout.activity_arena_tutorial, 4);
        sparseIntArray.put(R.layout.activity_blocked_user_list, 5);
        sparseIntArray.put(R.layout.activity_champions_chart, 6);
        sparseIntArray.put(R.layout.activity_combined_channel_list, 7);
        sparseIntArray.put(R.layout.activity_create_group_host, 8);
        sparseIntArray.put(R.layout.activity_default_web_view, 9);
        sparseIntArray.put(R.layout.activity_delete_confirmation, 10);
        sparseIntArray.put(R.layout.activity_edit_profile, 11);
        sparseIntArray.put(R.layout.activity_faq, 12);
        sparseIntArray.put(R.layout.activity_feed_category_host, 13);
        sparseIntArray.put(R.layout.activity_feed_post_stream_detail, 14);
        sparseIntArray.put(R.layout.activity_followers_following, 15);
        sparseIntArray.put(R.layout.activity_group_chat_host, 16);
        sparseIntArray.put(R.layout.activity_group_create_host_compose, 17);
        sparseIntArray.put(R.layout.activity_group_detail, 18);
        sparseIntArray.put(R.layout.activity_group_info_host, 19);
        sparseIntArray.put(R.layout.activity_group_invited_list, 20);
        sparseIntArray.put(R.layout.activity_group_members_list, 21);
        sparseIntArray.put(R.layout.activity_group_pinned_messages, 22);
        sparseIntArray.put(R.layout.activity_help_center, 23);
        sparseIntArray.put(R.layout.activity_image_crop, 24);
        sparseIntArray.put(R.layout.activity_image_preview, 25);
        sparseIntArray.put(R.layout.activity_images_slider, 26);
        sparseIntArray.put(R.layout.activity_invite, 27);
        sparseIntArray.put(R.layout.activity_invited_friend, 28);
        sparseIntArray.put(R.layout.activity_kyc, 29);
        sparseIntArray.put(R.layout.activity_kyc_tutorial, 30);
        sparseIntArray.put(R.layout.activity_league_detail_closed, 31);
        sparseIntArray.put(R.layout.activity_league_portfolio_holding, 32);
        sparseIntArray.put(R.layout.activity_league_post_joining, 33);
        sparseIntArray.put(R.layout.activity_league_pre_joining, 34);
        sparseIntArray.put(R.layout.activity_league_winner, 35);
        sparseIntArray.put(R.layout.activity_linkedin_authentication, 36);
        sparseIntArray.put(R.layout.activity_login, 37);
        sparseIntArray.put(R.layout.activity_main, 38);
        sparseIntArray.put(R.layout.activity_maintenance_window, 39);
        sparseIntArray.put(R.layout.activity_manage_subscription, 40);
        sparseIntArray.put(R.layout.activity_market_advanced_search, 41);
        sparseIntArray.put(R.layout.activity_market_option_search, 42);
        sparseIntArray.put(R.layout.activity_media_asset_upload_preview, 43);
        sparseIntArray.put(R.layout.activity_media_player, 44);
        sparseIntArray.put(R.layout.activity_message_invites, 45);
        sparseIntArray.put(R.layout.activity_message_thread_info, 46);
        sparseIntArray.put(R.layout.activity_message_thread_info_detail, 47);
        sparseIntArray.put(R.layout.activity_missions_host, 48);
        sparseIntArray.put(R.layout.activity_modify_host, 49);
        sparseIntArray.put(R.layout.activity_my_profile, 50);
        sparseIntArray.put(R.layout.activity_notifications, 51);
        sparseIntArray.put(R.layout.activity_offer_details, 52);
        sparseIntArray.put(R.layout.activity_offer_terms_and_conditions, 53);
        sparseIntArray.put(R.layout.activity_option_detail_host, 54);
        sparseIntArray.put(R.layout.activity_options_list_host, 55);
        sparseIntArray.put(R.layout.activity_portfolio_detail, 56);
        sparseIntArray.put(R.layout.activity_rate_app, 57);
        sparseIntArray.put(R.layout.activity_recharge_wallet, 58);
        sparseIntArray.put(R.layout.activity_redemption_host, 59);
        sparseIntArray.put(R.layout.activity_redemption_orders, 60);
        sparseIntArray.put(R.layout.activity_report_account, 61);
        sparseIntArray.put(R.layout.activity_ria_profile, 62);
        sparseIntArray.put(R.layout.activity_search_asset, 63);
        sparseIntArray.put(R.layout.activity_search_stock, 64);
        sparseIntArray.put(R.layout.activity_social_auth, 65);
        sparseIntArray.put(R.layout.activity_social_search_advanced, 66);
        sparseIntArray.put(R.layout.activity_splash, 67);
        sparseIntArray.put(R.layout.activity_stock_detail, 68);
        sparseIntArray.put(R.layout.activity_stock_detail_host, 69);
        sparseIntArray.put(R.layout.activity_stock_gyan, 70);
        sparseIntArray.put(R.layout.activity_stock_gyan_groups, 71);
        sparseIntArray.put(R.layout.activity_stock_gyan_index, 72);
        sparseIntArray.put(R.layout.activity_stock_list_host, 73);
        sparseIntArray.put(R.layout.activity_stock_trading_view_full_screen_chart, 74);
        sparseIntArray.put(R.layout.activity_top_portfolio_list, 75);
        sparseIntArray.put(R.layout.activity_transaction_history, 76);
        sparseIntArray.put(R.layout.activity_tutorials, 77);
        sparseIntArray.put(R.layout.activity_unlock_portfolio_list, 78);
        sparseIntArray.put(R.layout.activity_user_profile, 79);
        sparseIntArray.put(R.layout.activity_video_full_screen, 80);
        sparseIntArray.put(R.layout.activity_wallet_home, 81);
        sparseIntArray.put(R.layout.activity_withdrawable_limit, 82);
        sparseIntArray.put(R.layout.activity_withdrawal_details, 83);
        sparseIntArray.put(R.layout.activity_withdrawal_home, 84);
        sparseIntArray.put(R.layout.activity_withdrawal_host, 85);
        sparseIntArray.put(R.layout.activity_youtube_video_full_screen, 86);
        sparseIntArray.put(R.layout.arena_custom_tab, 87);
        sparseIntArray.put(R.layout.border_drawable_button, 88);
        sparseIntArray.put(R.layout.bottom_sheet_advance_transaction_filter, 89);
        sparseIntArray.put(R.layout.bottom_sheet_group_exit, 90);
        sparseIntArray.put(R.layout.bottom_sheet_kyc_cancel, 91);
        sparseIntArray.put(R.layout.bottom_sheet_kyc_mandatory, 92);
        sparseIntArray.put(R.layout.bottom_sheet_kyc_permission, 93);
        sparseIntArray.put(R.layout.bottom_sheet_kyc_retry_confirmation, 94);
        sparseIntArray.put(R.layout.bottom_sheet_league_exit, 95);
        sparseIntArray.put(R.layout.bottom_sheet_league_report, 96);
        sparseIntArray.put(R.layout.bottom_sheet_market_know_your_withdraw_limit, 97);
        sparseIntArray.put(R.layout.bottom_sheet_market_section_narration, 98);
        sparseIntArray.put(R.layout.bottom_sheet_message, 99);
        sparseIntArray.put(R.layout.bottom_sheet_missions_home, 100);
        sparseIntArray.put(R.layout.bottom_sheet_payment_withdrawal_otp_verify, 101);
        sparseIntArray.put(R.layout.bottom_sheet_social_action_confirmation, 102);
        sparseIntArray.put(R.layout.bottom_sheet_square_off, 103);
        sparseIntArray.put(R.layout.bottom_sheet_subscribe_to_access, 104);
        sparseIntArray.put(R.layout.bottom_sheet_subscription_upgrade_plan, 105);
        sparseIntArray.put(R.layout.bottom_sheet_subscription_upi_auto_pay_pre_confirmation, 106);
        sparseIntArray.put(R.layout.bottom_sheet_task_detail, 107);
        sparseIntArray.put(R.layout.bottom_sheet_wallet_announcement_action, 108);
        sparseIntArray.put(R.layout.bottom_sheet_winner_declared, 109);
        sparseIntArray.put(R.layout.cell_active_league_portfolio_sector_stock, 110);
        sparseIntArray.put(R.layout.cell_active_prepzone_portfolio_options, 111);
        sparseIntArray.put(R.layout.cell_advanced_search_options, 112);
        sparseIntArray.put(R.layout.cell_advanced_search_stocks, 113);
        sparseIntArray.put(R.layout.cell_all_top_portfolio, 114);
        sparseIntArray.put(R.layout.cell_arena_my_league_middle_layer, 115);
        sparseIntArray.put(R.layout.cell_arena_myleagues_recycler, 116);
        sparseIntArray.put(R.layout.cell_arena_upcoming_header, 117);
        sparseIntArray.put(R.layout.cell_arena_upcoming_middle_layer, 118);
        sparseIntArray.put(R.layout.cell_arena_upcoming_recycler, 119);
        sparseIntArray.put(R.layout.cell_asset_insight, 120);
        sparseIntArray.put(R.layout.cell_asset_insight_snapshot, 121);
        sparseIntArray.put(R.layout.cell_attach_proof_image, 122);
        sparseIntArray.put(R.layout.cell_block_user, 123);
        sparseIntArray.put(R.layout.cell_bottom_sheet_options, 124);
        sparseIntArray.put(R.layout.cell_champion, 125);
        sparseIntArray.put(R.layout.cell_chat_media_text_consolidated_view, 126);
        sparseIntArray.put(R.layout.cell_chat_parent_message, 127);
        sparseIntArray.put(R.layout.cell_compose, 128);
        sparseIntArray.put(R.layout.cell_confirm_withdrawal, 129);
        sparseIntArray.put(R.layout.cell_country_select, 130);
        sparseIntArray.put(R.layout.cell_discover_category_snapshot, 131);
        sparseIntArray.put(R.layout.cell_exit_chat_options, 132);
        sparseIntArray.put(R.layout.cell_featured_groups, 133);
        sparseIntArray.put(R.layout.cell_follower_following, 134);
        sparseIntArray.put(R.layout.cell_friend_image_title, 135);
        sparseIntArray.put(R.layout.cell_frozen_portfolio_options, 136);
        sparseIntArray.put(R.layout.cell_frozen_portfolio_stocks, 137);
        sparseIntArray.put(R.layout.cell_image_viewer_item, 138);
        sparseIntArray.put(R.layout.cell_inner_follower_following, 139);
        sparseIntArray.put(R.layout.cell_invite_contact, 140);
        sparseIntArray.put(R.layout.cell_invited_friend, 141);
        sparseIntArray.put(R.layout.cell_kyc_faq, 142);
        sparseIntArray.put(R.layout.cell_kyc_message, 143);
        sparseIntArray.put(R.layout.cell_league_declared_winner_board, 144);
        sparseIntArray.put(R.layout.cell_league_leader_board, 145);
        sparseIntArray.put(R.layout.cell_league_portfolio, 146);
        sparseIntArray.put(R.layout.cell_league_rule, 147);
        sparseIntArray.put(R.layout.cell_league_rule_v2, 148);
        sparseIntArray.put(R.layout.cell_league_upcoming, 149);
        sparseIntArray.put(R.layout.cell_league_upcoming_league_info, 150);
        sparseIntArray.put(R.layout.cell_league_upcoming_title, 151);
        sparseIntArray.put(R.layout.cell_league_winner, 152);
        sparseIntArray.put(R.layout.cell_maintenance_view, 153);
        sparseIntArray.put(R.layout.cell_market_sentiment, 154);
        sparseIntArray.put(R.layout.cell_mission_history, 155);
        sparseIntArray.put(R.layout.cell_mission_history_timeline, 156);
        sparseIntArray.put(R.layout.cell_mission_info, 157);
        sparseIntArray.put(R.layout.cell_model_portfolio, 158);
        sparseIntArray.put(R.layout.cell_my_league_header_layout, 159);
        sparseIntArray.put(R.layout.cell_my_league_v2, 160);
        sparseIntArray.put(R.layout.cell_my_league_v2_coming_soon, 161);
        sparseIntArray.put(R.layout.cell_my_league_v2_completed, 162);
        sparseIntArray.put(R.layout.cell_notification, 163);
        sparseIntArray.put(R.layout.cell_notification_category, 164);
        sparseIntArray.put(R.layout.cell_option, 165);
        sparseIntArray.put(R.layout.cell_option_chain, 166);
        sparseIntArray.put(R.layout.cell_person_image_title_menu, 167);
        sparseIntArray.put(R.layout.cell_pinned_message, 168);
        sparseIntArray.put(R.layout.cell_plan_overview, 169);
        sparseIntArray.put(R.layout.cell_portfolio_sector_stock, 170);
        sparseIntArray.put(R.layout.cell_portfolio_stock_history, 171);
        sparseIntArray.put(R.layout.cell_portfolio_stock_holding, 172);
        sparseIntArray.put(R.layout.cell_portfolio_stock_order, 173);
        sparseIntArray.put(R.layout.cell_portfolio_unlock, 174);
        sparseIntArray.put(R.layout.cell_post_attach_document, 175);
        sparseIntArray.put(R.layout.cell_post_image_item, 176);
        sparseIntArray.put(R.layout.cell_prize_distribution, 177);
        sparseIntArray.put(R.layout.cell_recent_performance, 178);
        sparseIntArray.put(R.layout.cell_redeemed_offers, 179);
        sparseIntArray.put(R.layout.cell_redemption_offer, 180);
        sparseIntArray.put(R.layout.cell_ria_basic_info, 181);
        sparseIntArray.put(R.layout.cell_ria_expertise, 182);
        sparseIntArray.put(R.layout.cell_ria_outline, 183);
        sparseIntArray.put(R.layout.cell_social_chat_group_item, 184);
        sparseIntArray.put(R.layout.cell_social_groups, 185);
        sparseIntArray.put(R.layout.cell_social_search_groups, 186);
        sparseIntArray.put(R.layout.cell_social_search_history, 187);
        sparseIntArray.put(R.layout.cell_social_search_users, 188);
        sparseIntArray.put(R.layout.cell_stock, 189);
        sparseIntArray.put(R.layout.cell_stock_analysis, 190);
        sparseIntArray.put(R.layout.cell_stock_gyan_card, 191);
        sparseIntArray.put(R.layout.cell_stock_gyan_group, 192);
        sparseIntArray.put(R.layout.cell_stock_holdings_pie_chart_view, 193);
        sparseIntArray.put(R.layout.cell_stock_overview_section, 194);
        sparseIntArray.put(R.layout.cell_stock_sort, 195);
        sparseIntArray.put(R.layout.cell_subscription_bulletin_nudge, 196);
        sparseIntArray.put(R.layout.cell_subscription_plan_detail, 197);
        sparseIntArray.put(R.layout.cell_top_group, 198);
        sparseIntArray.put(R.layout.cell_tutorial, 199);
        sparseIntArray.put(R.layout.cell_unlock_portfolio_expiry_option, 200);
        sparseIntArray.put(R.layout.cell_wallet_transactions, 201);
        sparseIntArray.put(R.layout.compose_bottom_sheet, 202);
        sparseIntArray.put(R.layout.content_main_activity, 203);
        sparseIntArray.put(R.layout.content_media_container, 204);
        sparseIntArray.put(R.layout.content_missions_home_bottom_sheet, 205);
        sparseIntArray.put(R.layout.content_modify_order_confirmation, 206);
        sparseIntArray.put(R.layout.content_modify_short_sell_order_confirmation, 207);
        sparseIntArray.put(R.layout.content_modify_stock_cover_order_confirmation, 208);
        sparseIntArray.put(R.layout.content_navigation_drawer_header, 209);
        sparseIntArray.put(R.layout.content_navigation_drawer_items, 210);
        sparseIntArray.put(R.layout.content_offer_details, 211);
        sparseIntArray.put(R.layout.content_redeemed_offers, 212);
        sparseIntArray.put(R.layout.content_redemption_offers_list, 213);
        sparseIntArray.put(R.layout.content_social, 214);
        sparseIntArray.put(R.layout.content_stock, 215);
        sparseIntArray.put(R.layout.content_stock_modify_buy_order, 216);
        sparseIntArray.put(R.layout.content_stock_modify_short_sell_order, 217);
        sparseIntArray.put(R.layout.content_stock_order, 218);
        sparseIntArray.put(R.layout.content_stock_order_confirmation, 219);
        sparseIntArray.put(R.layout.content_stock_short_sell_confirmation, 220);
        sparseIntArray.put(R.layout.content_stock_short_sell_order, 221);
        sparseIntArray.put(R.layout.custom_alert_dialog, 222);
        sparseIntArray.put(R.layout.customkeyboard, 223);
        sparseIntArray.put(R.layout.fragment_arena_asset_host, 224);
        sparseIntArray.put(R.layout.fragment_arena_asset_host_v2, 225);
        sparseIntArray.put(R.layout.fragment_arena_my_leagues_host, 226);
        sparseIntArray.put(R.layout.fragment_arena_upcoming_host, 227);
        sparseIntArray.put(R.layout.fragment_bottom_sheet, 228);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_alert, 229);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_filter, 230);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_invitation_response, 231);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_notifications_filter, 232);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_photo_select, 233);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_rename_portfolio, 234);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_reset_portfolio, 235);
        sparseIntArray.put(R.layout.fragment_bottom_sheet_unlock_portfolio, 236);
        sparseIntArray.put(R.layout.fragment_center_popup_dialog, 237);
        sparseIntArray.put(R.layout.fragment_clear_search_history_bottom_sheet, 238);
        sparseIntArray.put(R.layout.fragment_community_guidelines, 239);
        sparseIntArray.put(R.layout.fragment_completed_league, 240);
        sparseIntArray.put(R.layout.fragment_confirm_payment_dialog, 241);
        sparseIntArray.put(R.layout.fragment_create_social_group, 242);
        sparseIntArray.put(R.layout.fragment_delete_account_bottom_sheet, 243);
        sparseIntArray.put(R.layout.fragment_dialog_breakeven_chart, 244);
        sparseIntArray.put(R.layout.fragment_enter_pin_delete, 245);
        sparseIntArray.put(R.layout.fragment_exit_chat_dialog, 246);
        sparseIntArray.put(R.layout.fragment_feed_stream, 247);
        sparseIntArray.put(R.layout.fragment_feed_stream_compose, 248);
        sparseIntArray.put(R.layout.fragment_filter_recent_performance_bottom_sheet, 249);
        sparseIntArray.put(R.layout.fragment_fno_option_chain, 250);
        sparseIntArray.put(R.layout.fragment_fno_option_detail, 251);
        sparseIntArray.put(R.layout.fragment_fno_portfolio_holdings, 252);
        sparseIntArray.put(R.layout.fragment_group_description_edit, 253);
        sparseIntArray.put(R.layout.fragment_group_feed_and_chat_host, 254);
        sparseIntArray.put(R.layout.fragment_group_info_v2, 255);
        sparseIntArray.put(R.layout.fragment_group_messages, 256);
        sparseIntArray.put(R.layout.fragment_group_name_edit, 257);
        sparseIntArray.put(R.layout.fragment_home, 258);
        sparseIntArray.put(R.layout.fragment_info_bottom_sheet_fragment, 259);
        sparseIntArray.put(R.layout.fragment_intro, 260);
        sparseIntArray.put(R.layout.fragment_intro_template, 261);
        sparseIntArray.put(R.layout.fragment_kyc_completed, 262);
        sparseIntArray.put(R.layout.fragment_kyc_faq, 263);
        sparseIntArray.put(R.layout.fragment_kyc_maintenance, 264);
        sparseIntArray.put(R.layout.fragment_kyc_permission, 265);
        sparseIntArray.put(R.layout.fragment_kyc_query_submitted, 266);
        sparseIntArray.put(R.layout.fragment_kyc_steps, 267);
        sparseIntArray.put(R.layout.fragment_kyc_tutorial_card, 268);
        sparseIntArray.put(R.layout.fragment_kyc_verification_pending, 269);
        sparseIntArray.put(R.layout.fragment_kyc_verification_rejected, 270);
        sparseIntArray.put(R.layout.fragment_leaderboard, 271);
        sparseIntArray.put(R.layout.fragment_league_copy_portfolio, 272);
        sparseIntArray.put(R.layout.fragment_league_detail_payment_bottom_sheet, 273);
        sparseIntArray.put(R.layout.fragment_league_join, 274);
        sparseIntArray.put(R.layout.fragment_league_statistics, 275);
        sparseIntArray.put(R.layout.fragment_leagues_leader_board, 276);
        sparseIntArray.put(R.layout.fragment_leagues_porfolio, 277);
        sparseIntArray.put(R.layout.fragment_maintenance_v2, 278);
        sparseIntArray.put(R.layout.fragment_maintenance_window, 279);
        sparseIntArray.put(R.layout.fragment_market_asset_host, 280);
        sparseIntArray.put(R.layout.fragment_market_asset_insights, 281);
        sparseIntArray.put(R.layout.fragment_market_insights_detail, 282);
        sparseIntArray.put(R.layout.fragment_market_option_host, 283);
        sparseIntArray.put(R.layout.fragment_market_options_list, 284);
        sparseIntArray.put(R.layout.fragment_market_search_options_list, 285);
        sparseIntArray.put(R.layout.fragment_market_stocks_host, 286);
        sparseIntArray.put(R.layout.fragment_market_stocks_list, 287);
        sparseIntArray.put(R.layout.fragment_member_options_bottom_sheet, 288);
        sparseIntArray.put(R.layout.fragment_mission_history, 289);
        sparseIntArray.put(R.layout.fragment_mission_task_detail, 290);
        sparseIntArray.put(R.layout.fragment_missions_home, 291);
        sparseIntArray.put(R.layout.fragment_missions_status_detail, 292);
        sparseIntArray.put(R.layout.fragment_mobile_login, 293);
        sparseIntArray.put(R.layout.fragment_mobile_register, 294);
        sparseIntArray.put(R.layout.fragment_modify_order_confirmation, 295);
        sparseIntArray.put(R.layout.fragment_modify_short_sell_order_confirmation, 296);
        sparseIntArray.put(R.layout.fragment_modify_stock_cover_order, 297);
        sparseIntArray.put(R.layout.fragment_modify_stock_cover_order_confirmation, 298);
        sparseIntArray.put(R.layout.fragment_my_profile_group, 299);
        sparseIntArray.put(R.layout.fragment_my_subscription, 300);
        sparseIntArray.put(R.layout.fragment_name_register, 301);
        sparseIntArray.put(R.layout.fragment_option_order_detail_bottom_sheet, 302);
        sparseIntArray.put(R.layout.fragment_option_pending_order, 303);
        sparseIntArray.put(R.layout.fragment_other_subscription_plans, 304);
        sparseIntArray.put(R.layout.fragment_otp_entry_verification, 305);
        sparseIntArray.put(R.layout.fragment_payment_abort_transaction_bottom_sheet, 306);
        sparseIntArray.put(R.layout.fragment_payment_status_bottom_sheet, StatusLine.HTTP_TEMP_REDIRECT);
        sparseIntArray.put(R.layout.fragment_pin_login, StatusLine.HTTP_PERM_REDIRECT);
        sparseIntArray.put(R.layout.fragment_pin_retry_withdrawal, 309);
        sparseIntArray.put(R.layout.fragment_pin_updated, 310);
        sparseIntArray.put(R.layout.fragment_portfolio, 311);
        sparseIntArray.put(R.layout.fragment_portfolio_fno_history, 312);
        sparseIntArray.put(R.layout.fragment_portfolio_fno_orders, 313);
        sparseIntArray.put(R.layout.fragment_portfolio_stock_history, 314);
        sparseIntArray.put(R.layout.fragment_portfolio_stock_holding, 315);
        sparseIntArray.put(R.layout.fragment_portfolio_stock_order, 316);
        sparseIntArray.put(R.layout.fragment_portfolio_submitted, 317);
        sparseIntArray.put(R.layout.fragment_profile_timeline, 318);
        sparseIntArray.put(R.layout.fragment_re_set_pin_2, 319);
        sparseIntArray.put(R.layout.fragment_redeemed_offers, 320);
        sparseIntArray.put(R.layout.fragment_redemption_offers_list, 321);
        sparseIntArray.put(R.layout.fragment_redemption_status_bottom_sheet, 322);
        sparseIntArray.put(R.layout.fragment_search_contact_v2, 323);
        sparseIntArray.put(R.layout.fragment_set_pin, 324);
        sparseIntArray.put(R.layout.fragment_share_your_achievement_dialog, 325);
        sparseIntArray.put(R.layout.fragment_social_chat_list, 326);
        sparseIntArray.put(R.layout.fragment_social_discover, 327);
        sparseIntArray.put(R.layout.fragment_social_home_feed_compose, 328);
        sparseIntArray.put(R.layout.fragment_social_host, 329);
        sparseIntArray.put(R.layout.fragment_sort_by_bottom_sheet_dialog, 330);
        sparseIntArray.put(R.layout.fragment_sort_stock, 331);
        sparseIntArray.put(R.layout.fragment_stock_analysis, 332);
        sparseIntArray.put(R.layout.fragment_stock_charts, 333);
        sparseIntArray.put(R.layout.fragment_stock_cover_order, 334);
        sparseIntArray.put(R.layout.fragment_stock_cover_order_confirmation, 335);
        sparseIntArray.put(R.layout.fragment_stock_detail, 336);
        sparseIntArray.put(R.layout.fragment_stock_gyan, 337);
        sparseIntArray.put(R.layout.fragment_stock_list, 338);
        sparseIntArray.put(R.layout.fragment_stock_modify_buy_order, 339);
        sparseIntArray.put(R.layout.fragment_stock_modify_short_sell_order, 340);
        sparseIntArray.put(R.layout.fragment_stock_news, 341);
        sparseIntArray.put(R.layout.fragment_stock_order, 342);
        sparseIntArray.put(R.layout.fragment_stock_order_confirmation, 343);
        sparseIntArray.put(R.layout.fragment_stock_order_pending, 344);
        sparseIntArray.put(R.layout.fragment_stock_overview_v2, 345);
        sparseIntArray.put(R.layout.fragment_stock_payment_success, 346);
        sparseIntArray.put(R.layout.fragment_stock_sell, 347);
        sparseIntArray.put(R.layout.fragment_stock_sell_order_confirmation, 348);
        sparseIntArray.put(R.layout.fragment_stock_short_sell_confirmation, 349);
        sparseIntArray.put(R.layout.fragment_stock_short_sell_order, 350);
        sparseIntArray.put(R.layout.fragment_stocks_list, 351);
        sparseIntArray.put(R.layout.fragment_subscription_downgrade_prompt, 352);
        sparseIntArray.put(R.layout.fragment_subscription_maintenance, 353);
        sparseIntArray.put(R.layout.fragment_subscription_plan_confirmation, 354);
        sparseIntArray.put(R.layout.fragment_subscription_purchase_non_success, 355);
        sparseIntArray.put(R.layout.fragment_subscription_purchase_status, 356);
        sparseIntArray.put(R.layout.fragment_unfollow_bottom_sheet, 357);
        sparseIntArray.put(R.layout.fragment_unlock_portfolio_details, 358);
        sparseIntArray.put(R.layout.fragment_unlock_portfolio_list, 359);
        sparseIntArray.put(R.layout.fragment_user_blocked, 360);
        sparseIntArray.put(R.layout.fragment_user_portfolio_details, 361);
        sparseIntArray.put(R.layout.fragment_user_stats, 362);
        sparseIntArray.put(R.layout.fragment_video_tutorial, 363);
        sparseIntArray.put(R.layout.fragment_wallet_transaction_detail, 364);
        sparseIntArray.put(R.layout.fragment_wallet_transaction_list, 365);
        sparseIntArray.put(R.layout.home_coverflow_section, 366);
        sparseIntArray.put(R.layout.layout_arrow_slider, 367);
        sparseIntArray.put(R.layout.layout_chip_group_view, 368);
        sparseIntArray.put(R.layout.layout_chip_view, 369);
        sparseIntArray.put(R.layout.layout_compose_view, 370);
        sparseIntArray.put(R.layout.layout_content_mission_detail, 371);
        sparseIntArray.put(R.layout.layout_content_mission_task_completed, 372);
        sparseIntArray.put(R.layout.layout_country_select_bottom_sheet_fragment, 373);
        sparseIntArray.put(R.layout.layout_create_account_footer, 374);
        sparseIntArray.put(R.layout.layout_crown_image_view, 375);
        sparseIntArray.put(R.layout.layout_custom_dialog_multiple_choice, 376);
        sparseIntArray.put(R.layout.layout_custom_dialog_single_choice, 377);
        sparseIntArray.put(R.layout.layout_custom_player_control, 378);
        sparseIntArray.put(R.layout.layout_display_view, 379);
        sparseIntArray.put(R.layout.layout_display_view_v2, 380);
        sparseIntArray.put(R.layout.layout_fno_returns_container, 381);
        sparseIntArray.put(R.layout.layout_group_chat_messages, 382);
        sparseIntArray.put(R.layout.layout_group_info_league, 383);
        sparseIntArray.put(R.layout.layout_group_tags_view, 384);
        sparseIntArray.put(R.layout.layout_horizontal_discover_category, 385);
        sparseIntArray.put(R.layout.layout_image_title_three_block, 386);
        sparseIntArray.put(R.layout.layout_input_view, 387);
        sparseIntArray.put(R.layout.layout_league_portfolio_container, 388);
        sparseIntArray.put(R.layout.layout_league_portfolio_snapshot, 389);
        sparseIntArray.put(R.layout.layout_league_winner, 390);
        sparseIntArray.put(R.layout.layout_leagues_joined, 391);
        sparseIntArray.put(R.layout.layout_login_account_footer, 392);
        sparseIntArray.put(R.layout.layout_maintenance_v2, 393);
        sparseIntArray.put(R.layout.layout_market_asset_toolbar_view, 394);
        sparseIntArray.put(R.layout.layout_market_search_results, 395);
        sparseIntArray.put(R.layout.layout_market_slider, 396);
        sparseIntArray.put(R.layout.layout_mission_detail_cta, 397);
        sparseIntArray.put(R.layout.layout_mission_earnings, 398);
        sparseIntArray.put(R.layout.layout_mission_history_completed, 399);
        sparseIntArray.put(R.layout.layout_mission_history_failed, 400);
        sparseIntArray.put(R.layout.layout_mission_history_under_review, TokenInvalidationInterceptor.InvalidatedTokenResponseCode);
        sparseIntArray.put(R.layout.layout_mission_how_to_play, 402);
        sparseIntArray.put(R.layout.layout_mission_input_view, 403);
        sparseIntArray.put(R.layout.layout_mission_input_view_widget, 404);
        sparseIntArray.put(R.layout.layout_mission_progress_bar, 405);
        sparseIntArray.put(R.layout.layout_mission_time_status_chip, 406);
        sparseIntArray.put(R.layout.layout_mission_your_reward_chip, 407);
        sparseIntArray.put(R.layout.layout_missions_card_header_banner, 408);
        sparseIntArray.put(R.layout.layout_missions_home_user_info, 409);
        sparseIntArray.put(R.layout.layout_navigation_drawer, 410);
        sparseIntArray.put(R.layout.layout_no_internet_connection, 411);
        sparseIntArray.put(R.layout.layout_payment_error_child_view, 412);
        sparseIntArray.put(R.layout.layout_periodic_gain, 413);
        sparseIntArray.put(R.layout.layout_popup_no_internet_connection, 414);
        sparseIntArray.put(R.layout.layout_portfolio_balance, 415);
        sparseIntArray.put(R.layout.layout_portfolio_data_league, 416);
        sparseIntArray.put(R.layout.layout_portfolio_fno_value, 417);
        sparseIntArray.put(R.layout.layout_portfolio_history_details, 418);
        sparseIntArray.put(R.layout.layout_portfolio_holdings_stocks, 419);
        sparseIntArray.put(R.layout.layout_portfolio_order_details, 420);
        sparseIntArray.put(R.layout.layout_portfolio_returns, StatusLine.HTTP_MISDIRECTED_REQUEST);
        sparseIntArray.put(R.layout.layout_portfolio_value, 422);
        sparseIntArray.put(R.layout.layout_portfolio_value_details, 423);
        sparseIntArray.put(R.layout.layout_prep_zone_header, 424);
        sparseIntArray.put(R.layout.layout_prepzone_whats_new, 425);
        sparseIntArray.put(R.layout.layout_price_input_view, 426);
        sparseIntArray.put(R.layout.layout_profile_social_auth, 427);
        sparseIntArray.put(R.layout.layout_profit_container, 428);
        sparseIntArray.put(R.layout.layout_proof_upload_view, 429);
        sparseIntArray.put(R.layout.layout_search_contact, 430);
        sparseIntArray.put(R.layout.layout_search_stocks, 431);
        sparseIntArray.put(R.layout.layout_social_input_view, 432);
        sparseIntArray.put(R.layout.layout_social_message_input_with_cta, 433);
        sparseIntArray.put(R.layout.layout_social_search_results, 434);
        sparseIntArray.put(R.layout.layout_stock_change_info, 435);
        sparseIntArray.put(R.layout.layout_stock_change_info_bold, 436);
        sparseIntArray.put(R.layout.layout_stock_fundamentals, 437);
        sparseIntArray.put(R.layout.layout_stock_holdings_pie_chart_view, 438);
        sparseIntArray.put(R.layout.layout_stock_mentionable_edit_text, 439);
        sparseIntArray.put(R.layout.layout_stock_specs, 440);
        sparseIntArray.put(R.layout.layout_subscription_plan_filter, 441);
        sparseIntArray.put(R.layout.layout_timer_container, 442);
        sparseIntArray.put(R.layout.layout_tnc_registration, 443);
        sparseIntArray.put(R.layout.layout_transfer_pending, 444);
        sparseIntArray.put(R.layout.layout_upcoming_league_sort, 445);
        sparseIntArray.put(R.layout.layout_vertical_discover_category, 446);
        sparseIntArray.put(R.layout.layout_video_player, 447);
        sparseIntArray.put(R.layout.layout_video_settings_dialog, 448);
        sparseIntArray.put(R.layout.layout_wallet_bifurcation, 449);
        sparseIntArray.put(R.layout.layout_withdrawal_bank, 450);
        sparseIntArray.put(R.layout.layout_withdrawal_paytm_wallet, 451);
        sparseIntArray.put(R.layout.layout_withdrawal_upi, 452);
        sparseIntArray.put(R.layout.list_item_chat_message_footer, 453);
        sparseIntArray.put(R.layout.list_item_chat_message_interaction_layout, 454);
        sparseIntArray.put(R.layout.list_item_chat_message_me, 455);
        sparseIntArray.put(R.layout.list_item_chat_message_other, 456);
        sparseIntArray.put(R.layout.list_item_chat_message_reported, 457);
        sparseIntArray.put(R.layout.list_item_chat_reported_message_me, 458);
        sparseIntArray.put(R.layout.list_item_chat_reported_message_other, 459);
        sparseIntArray.put(R.layout.list_item_group_chat_date_layout, 460);
        sparseIntArray.put(R.layout.list_item_group_chat_thread_user_me, 461);
        sparseIntArray.put(R.layout.list_item_group_chat_thread_user_other, 462);
        sparseIntArray.put(R.layout.list_item_message_document_layout, 463);
        sparseIntArray.put(R.layout.list_item_message_image_layout, 464);
        sparseIntArray.put(R.layout.list_item_message_text_layout, 465);
        sparseIntArray.put(R.layout.list_item_parent_message_text_layout, 466);
        sparseIntArray.put(R.layout.list_item_thread_detail_info_reply, 467);
        sparseIntArray.put(R.layout.multiple_country_input_view, 468);
        sparseIntArray.put(R.layout.social_merge_button_layout, 469);
        sparseIntArray.put(R.layout.sticker_item_layout, 470);
        sparseIntArray.put(R.layout.stockgro_list_item_chat_parent_layout, 471);
        sparseIntArray.put(R.layout.understaring_option_bottom_sheet, 472);
        sparseIntArray.put(R.layout.view_allow_contact_access, 473);
        sparseIntArray.put(R.layout.view_no_channels, 474);
        sparseIntArray.put(R.layout.view_no_contact_search_results, 475);
        sparseIntArray.put(R.layout.view_no_results, 476);
        sparseIntArray.put(R.layout.widget_expert_trade_view, 477);
        sparseIntArray.put(R.layout.widget_ria_basic_info, 478);
        sparseIntArray.put(R.layout.widget_ria_expertise, 479);
        sparseIntArray.put(R.layout.widget_ria_outline, 480);
        sparseIntArray.put(R.layout.withdrawal_pin_layout, 481);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [ba.l2, m4.m, ba.k2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v113, types: [ba.n2, m4.m, ba.m2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [m4.m, java.lang.Object, ba.r0, ba.q0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [m4.m, ba.w1, java.lang.Object, ba.v1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [m4.m, ba.h2, java.lang.Object, ba.g2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ba.q2, m4.m, java.lang.Object, ba.r2] */
    public static m d(View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_add_friends_host_0".equals(obj)) {
                    return new b(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_add_friends_host is invalid. Received: ", obj));
            case 2:
                if ("layout/activity_add_members_host_compose_0".equals(obj)) {
                    return new d(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_add_members_host_compose is invalid. Received: ", obj));
            case 3:
                if ("layout/activity_app_about_section_0".equals(obj)) {
                    return new f(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_app_about_section is invalid. Received: ", obj));
            case 4:
                if ("layout/activity_arena_tutorial_0".equals(obj)) {
                    return new ba.h(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_arena_tutorial is invalid. Received: ", obj));
            case 5:
                if ("layout/activity_blocked_user_list_0".equals(obj)) {
                    return new j(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_blocked_user_list is invalid. Received: ", obj));
            case 6:
                if ("layout/activity_champions_chart_0".equals(obj)) {
                    return new l(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_champions_chart is invalid. Received: ", obj));
            case 7:
                if ("layout/activity_combined_channel_list_0".equals(obj)) {
                    return new n(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_combined_channel_list is invalid. Received: ", obj));
            case 8:
                if ("layout/activity_create_group_host_0".equals(obj)) {
                    return new p(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_create_group_host is invalid. Received: ", obj));
            case 9:
                if ("layout/activity_default_web_view_0".equals(obj)) {
                    return new r(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_default_web_view is invalid. Received: ", obj));
            case 10:
                if ("layout/activity_delete_confirmation_0".equals(obj)) {
                    return new t(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_delete_confirmation is invalid. Received: ", obj));
            case 11:
                if ("layout/activity_edit_profile_0".equals(obj)) {
                    return new v(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_edit_profile is invalid. Received: ", obj));
            case 12:
                if ("layout/activity_faq_0".equals(obj)) {
                    return new x(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_faq is invalid. Received: ", obj));
            case 13:
                if ("layout/activity_feed_category_host_0".equals(obj)) {
                    return new z(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_feed_category_host is invalid. Received: ", obj));
            case 14:
                if ("layout/activity_feed_post_stream_detail_0".equals(obj)) {
                    return new b0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_feed_post_stream_detail is invalid. Received: ", obj));
            case 15:
                if ("layout/activity_followers_following_0".equals(obj)) {
                    return new d0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_followers_following is invalid. Received: ", obj));
            case 16:
                if ("layout/activity_group_chat_host_0".equals(obj)) {
                    return new f0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_chat_host is invalid. Received: ", obj));
            case 17:
                if ("layout/activity_group_create_host_compose_0".equals(obj)) {
                    return new h0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_create_host_compose is invalid. Received: ", obj));
            case 18:
                if ("layout/activity_group_detail_0".equals(obj)) {
                    return new j0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_detail is invalid. Received: ", obj));
            case 19:
                if ("layout/activity_group_info_host_0".equals(obj)) {
                    return new l0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_info_host is invalid. Received: ", obj));
            case 20:
                if ("layout/activity_group_invited_list_0".equals(obj)) {
                    return new n0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_invited_list is invalid. Received: ", obj));
            case 21:
                if ("layout/activity_group_members_list_0".equals(obj)) {
                    return new p0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_members_list is invalid. Received: ", obj));
            case 22:
                if ("layout/activity_group_pinned_messages_0".equals(obj)) {
                    Object[] j10 = m.j(view, 9, null, r0.A);
                    FrameLayout frameLayout = (FrameLayout) j10[0];
                    RecyclerView recyclerView = (RecyclerView) j10[8];
                    ImageView imageView = (ImageView) j10[6];
                    ImageView imageView2 = (ImageView) j10[7];
                    Toolbar toolbar = (Toolbar) j10[5];
                    ?? q0Var = new q0(null, view, frameLayout, recyclerView, imageView, imageView2, toolbar, (Toolbar) j10[2], (TextView) j10[4]);
                    q0Var.f5922z = -1L;
                    q0Var.f5813s.setTag(null);
                    view.setTag(R.id.dataBinding, q0Var);
                    q0Var.h();
                    return q0Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_group_pinned_messages is invalid. Received: ", obj));
            case 23:
                if ("layout/activity_help_center_0".equals(obj)) {
                    return new t0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_help_center is invalid. Received: ", obj));
            case 24:
                if ("layout/activity_image_crop_0".equals(obj)) {
                    return new v0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_image_crop is invalid. Received: ", obj));
            case 25:
                if ("layout/activity_image_preview_0".equals(obj)) {
                    return new x0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_image_preview is invalid. Received: ", obj));
            case 26:
                if ("layout/activity_images_slider_0".equals(obj)) {
                    return new z0(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_images_slider is invalid. Received: ", obj));
            case 27:
                if ("layout/activity_invite_0".equals(obj)) {
                    return new b1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_invite is invalid. Received: ", obj));
            case 28:
                if ("layout/activity_invited_friend_0".equals(obj)) {
                    return new d1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_invited_friend is invalid. Received: ", obj));
            case 29:
                if ("layout/activity_kyc_0".equals(obj)) {
                    return new f1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_kyc is invalid. Received: ", obj));
            case 30:
                if ("layout/activity_kyc_tutorial_0".equals(obj)) {
                    return new h1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_kyc_tutorial is invalid. Received: ", obj));
            case 31:
                if ("layout/activity_league_detail_closed_0".equals(obj)) {
                    return new j1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_league_detail_closed is invalid. Received: ", obj));
            case 32:
                if ("layout/activity_league_portfolio_holding_0".equals(obj)) {
                    return new l1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_league_portfolio_holding is invalid. Received: ", obj));
            case 33:
                if ("layout/activity_league_post_joining_0".equals(obj)) {
                    return new n1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_league_post_joining is invalid. Received: ", obj));
            case 34:
                if ("layout/activity_league_pre_joining_0".equals(obj)) {
                    return new p1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_league_pre_joining is invalid. Received: ", obj));
            case 35:
                if ("layout/activity_league_winner_0".equals(obj)) {
                    return new r1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_league_winner is invalid. Received: ", obj));
            case 36:
                if ("layout/activity_linkedin_authentication_0".equals(obj)) {
                    return new t1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_linkedin_authentication is invalid. Received: ", obj));
            case 37:
                if ("layout/activity_login_0".equals(obj)) {
                    return new u1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_login is invalid. Received: ", obj));
            case 38:
                if ("layout/activity_main_0".equals(obj)) {
                    Object[] j11 = m.j(view, 4, w1.f6499x, null);
                    ?? v1Var = new v1(null, view, (wd) j11[2], (mt) j11[3], (DrawerLayout) j11[0], (NavigationView) j11[1]);
                    v1Var.f6500w = -1L;
                    wd wdVar = v1Var.f6365s;
                    if (wdVar != null) {
                        wdVar.f27496j = v1Var;
                    }
                    mt mtVar = v1Var.f6366t;
                    if (mtVar != null) {
                        mtVar.f27496j = v1Var;
                    }
                    v1Var.f6367u.setTag(null);
                    v1Var.f6368v.setTag(null);
                    view.setTag(R.id.dataBinding, v1Var);
                    v1Var.h();
                    return v1Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_main is invalid. Received: ", obj));
            case 39:
                if ("layout/activity_maintenance_window_0".equals(obj)) {
                    return new y1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_maintenance_window is invalid. Received: ", obj));
            case 40:
                if ("layout/activity_manage_subscription_0".equals(obj)) {
                    return new z1(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_manage_subscription is invalid. Received: ", obj));
            case 41:
                if ("layout/activity_market_advanced_search_0".equals(obj)) {
                    return new b2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_market_advanced_search is invalid. Received: ", obj));
            case 42:
                if ("layout/activity_market_option_search_0".equals(obj)) {
                    return new d2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_market_option_search is invalid. Received: ", obj));
            case 43:
                if ("layout/activity_media_asset_upload_preview_0".equals(obj)) {
                    return new f2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_media_asset_upload_preview is invalid. Received: ", obj));
            case 44:
                if ("layout/activity_media_player_0".equals(obj)) {
                    Object[] j12 = m.j(view, 4, null, h2.f4885x);
                    ?? g2Var = new g2(null, view, (CoordinatorLayout) j12[0], (ImageView) j12[2], (ContentLoadingProgressBar) j12[3], (SurfaceView) j12[1]);
                    g2Var.f4886w = -1L;
                    g2Var.f4774s.setTag(null);
                    view.setTag(R.id.dataBinding, g2Var);
                    g2Var.h();
                    return g2Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_media_player is invalid. Received: ", obj));
            case 45:
                if ("layout/activity_message_invites_0".equals(obj)) {
                    return new j2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_message_invites is invalid. Received: ", obj));
            case 46:
                if ("layout/activity_message_thread_info_0".equals(obj)) {
                    Object[] j13 = m.j(view, 19, null, l2.f5312u);
                    FrameLayout frameLayout2 = (FrameLayout) j13[0];
                    ?? k2Var = new k2(null, view, frameLayout2);
                    k2Var.f5313t = -1L;
                    k2Var.f5199s.setTag(null);
                    view.setTag(R.id.dataBinding, k2Var);
                    k2Var.h();
                    return k2Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_message_thread_info is invalid. Received: ", obj));
            case 47:
                if ("layout/activity_message_thread_info_detail_0".equals(obj)) {
                    Object[] j14 = m.j(view, 18, n2.H, n2.I);
                    c8 c8Var = (c8) j14[3];
                    FrameLayout frameLayout3 = (FrameLayout) j14[0];
                    ImageView imageView3 = (ImageView) j14[12];
                    ConstraintLayout constraintLayout = (ConstraintLayout) j14[1];
                    LinearLayout linearLayout = (LinearLayout) j14[2];
                    ev evVar = (ev) j14[4];
                    RecyclerView recyclerView2 = (RecyclerView) j14[15];
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j14[16];
                    TextView textView = (TextView) j14[10];
                    TextView textView2 = (TextView) j14[13];
                    ImageView imageView4 = (ImageView) j14[8];
                    TextView textView3 = (TextView) j14[9];
                    NestedScrollView nestedScrollView = (NestedScrollView) j14[6];
                    Toolbar toolbar2 = (Toolbar) j14[5];
                    ?? m2Var = new m2(null, view, c8Var, frameLayout3, imageView3, constraintLayout, linearLayout, evVar, recyclerView2, constraintLayout2, textView, textView2, imageView4, textView3, nestedScrollView, toolbar2);
                    m2Var.G = -1L;
                    c8 c8Var2 = m2Var.f5424s;
                    if (c8Var2 != null) {
                        c8Var2.f27496j = m2Var;
                    }
                    m2Var.f5425t.setTag(null);
                    m2Var.f5427v.setTag(null);
                    m2Var.f5428w.setTag(null);
                    ev evVar2 = m2Var.f5429x;
                    if (evVar2 != null) {
                        evVar2.f27496j = m2Var;
                    }
                    view.setTag(R.id.dataBinding, m2Var);
                    m2Var.h();
                    return m2Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_message_thread_info_detail is invalid. Received: ", obj));
            case 48:
                if ("layout/activity_missions_host_0".equals(obj)) {
                    return new o2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_missions_host is invalid. Received: ", obj));
            case 49:
                if ("layout/activity_modify_host_0".equals(obj)) {
                    return new p2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_modify_host is invalid. Received: ", obj));
            case 50:
                if ("layout/activity_my_profile_0".equals(obj)) {
                    Object[] j15 = m.j(view, 4, null, r2.f5925w);
                    ?? q2Var = new q2(null, view, (ConstraintLayout) j15[0], (ProgressBar) j15[2], (Toolbar) j15[1]);
                    q2Var.f5926v = -1L;
                    q2Var.f5825s.setTag(null);
                    view.setTag(R.id.dataBinding, q2Var);
                    q2Var.h();
                    return q2Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_my_profile is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [m4.m, ba.g3, java.lang.Object, ba.f3] */
    public static m e(View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/activity_notifications_0".equals(obj)) {
                    return new t2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_notifications is invalid. Received: ", obj));
            case 52:
                if ("layout/activity_offer_details_0".equals(obj)) {
                    return new v2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_offer_details is invalid. Received: ", obj));
            case 53:
                if ("layout/activity_offer_terms_and_conditions_0".equals(obj)) {
                    return new x2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_offer_terms_and_conditions is invalid. Received: ", obj));
            case 54:
                if ("layout/activity_option_detail_host_0".equals(obj)) {
                    return new y2(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_option_detail_host is invalid. Received: ", obj));
            case 55:
                if ("layout/activity_options_list_host_0".equals(obj)) {
                    return new a3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_options_list_host is invalid. Received: ", obj));
            case 56:
                if ("layout/activity_portfolio_detail_0".equals(obj)) {
                    return new c3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_portfolio_detail is invalid. Received: ", obj));
            case 57:
                if ("layout/activity_rate_app_0".equals(obj)) {
                    return new e3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_rate_app is invalid. Received: ", obj));
            case 58:
                if ("layout/activity_recharge_wallet_0".equals(obj)) {
                    Object[] j10 = m.j(view, 14, null, g3.E);
                    MaterialButton materialButton = (MaterialButton) j10[13];
                    TextView textView = (TextView) j10[6];
                    TextView textView2 = (TextView) j10[9];
                    TextView textView3 = (TextView) j10[7];
                    InputView inputView = (InputView) j10[4];
                    TextView textView4 = (TextView) j10[8];
                    TextView textView5 = (TextView) j10[1];
                    TextView textView6 = (TextView) j10[10];
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) j10[0];
                    ?? f3Var = new f3(null, view, materialButton, textView, textView2, textView3, inputView, textView4, textView5, textView6, coordinatorLayout, (Toolbar) j10[2]);
                    f3Var.D = -1L;
                    f3Var.f4664y.setTag(null);
                    f3Var.A.setTag(null);
                    view.setTag(R.id.dataBinding, f3Var);
                    f3Var.h();
                    return f3Var;
                }
                throw new IllegalArgumentException(h.q("The tag for activity_recharge_wallet is invalid. Received: ", obj));
            case 59:
                if ("layout/activity_redemption_host_0".equals(obj)) {
                    return new i3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_redemption_host is invalid. Received: ", obj));
            case 60:
                if ("layout/activity_redemption_orders_0".equals(obj)) {
                    return new k3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_redemption_orders is invalid. Received: ", obj));
            case 61:
                if ("layout/activity_report_account_0".equals(obj)) {
                    return new m3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_report_account is invalid. Received: ", obj));
            case 62:
                if ("layout/activity_ria_profile_0".equals(obj)) {
                    return new o3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_ria_profile is invalid. Received: ", obj));
            case 63:
                if ("layout/activity_search_asset_0".equals(obj)) {
                    return new q3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_search_asset is invalid. Received: ", obj));
            case 64:
                if ("layout/activity_search_stock_0".equals(obj)) {
                    return new s3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_search_stock is invalid. Received: ", obj));
            case 65:
                if ("layout/activity_social_auth_0".equals(obj)) {
                    return new u3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_social_auth is invalid. Received: ", obj));
            case 66:
                if ("layout/activity_social_search_advanced_0".equals(obj)) {
                    return new w3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_social_search_advanced is invalid. Received: ", obj));
            case 67:
                if ("layout/activity_splash_0".equals(obj)) {
                    return new x3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_splash is invalid. Received: ", obj));
            case 68:
                if ("layout/activity_stock_detail_0".equals(obj)) {
                    return new y3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_detail is invalid. Received: ", obj));
            case 69:
                if ("layout/activity_stock_detail_host_0".equals(obj)) {
                    return new z3(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_detail_host is invalid. Received: ", obj));
            case 70:
                if ("layout/activity_stock_gyan_0".equals(obj)) {
                    return new b4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_gyan is invalid. Received: ", obj));
            case 71:
                if ("layout/activity_stock_gyan_groups_0".equals(obj)) {
                    return new d4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_gyan_groups is invalid. Received: ", obj));
            case 72:
                if ("layout/activity_stock_gyan_index_0".equals(obj)) {
                    return new f4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_gyan_index is invalid. Received: ", obj));
            case 73:
                if ("layout/activity_stock_list_host_0".equals(obj)) {
                    return new g4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_list_host is invalid. Received: ", obj));
            case 74:
                if ("layout/activity_stock_trading_view_full_screen_chart_0".equals(obj)) {
                    return new i4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_stock_trading_view_full_screen_chart is invalid. Received: ", obj));
            case 75:
                if ("layout/activity_top_portfolio_list_0".equals(obj)) {
                    return new k4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_top_portfolio_list is invalid. Received: ", obj));
            case 76:
                if ("layout/activity_transaction_history_0".equals(obj)) {
                    return new l4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_transaction_history is invalid. Received: ", obj));
            case 77:
                if ("layout/activity_tutorials_0".equals(obj)) {
                    return new n4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_tutorials is invalid. Received: ", obj));
            case 78:
                if ("layout/activity_unlock_portfolio_list_0".equals(obj)) {
                    return new o4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_unlock_portfolio_list is invalid. Received: ", obj));
            case 79:
                if ("layout/activity_user_profile_0".equals(obj)) {
                    return new q4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_user_profile is invalid. Received: ", obj));
            case 80:
                if ("layout/activity_video_full_screen_0".equals(obj)) {
                    return new s4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_video_full_screen is invalid. Received: ", obj));
            case 81:
                if ("layout/activity_wallet_home_0".equals(obj)) {
                    return new u4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_wallet_home is invalid. Received: ", obj));
            case 82:
                if ("layout/activity_withdrawable_limit_0".equals(obj)) {
                    return new w4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_withdrawable_limit is invalid. Received: ", obj));
            case 83:
                if ("layout/activity_withdrawal_details_0".equals(obj)) {
                    return new y4(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_withdrawal_details is invalid. Received: ", obj));
            case 84:
                if ("layout/activity_withdrawal_home_0".equals(obj)) {
                    return new a5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_withdrawal_home is invalid. Received: ", obj));
            case 85:
                if ("layout/activity_withdrawal_host_0".equals(obj)) {
                    return new b5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_withdrawal_host is invalid. Received: ", obj));
            case 86:
                if ("layout/activity_youtube_video_full_screen_0".equals(obj)) {
                    return new d5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for activity_youtube_video_full_screen is invalid. Received: ", obj));
            case 87:
                if ("layout/arena_custom_tab_0".equals(obj)) {
                    return new f5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for arena_custom_tab is invalid. Received: ", obj));
            case 88:
                if ("layout/border_drawable_button_0".equals(obj)) {
                    return new h5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for border_drawable_button is invalid. Received: ", obj));
            case 89:
                if ("layout/bottom_sheet_advance_transaction_filter_0".equals(obj)) {
                    return new j5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_advance_transaction_filter is invalid. Received: ", obj));
            case 90:
                if ("layout/bottom_sheet_group_exit_0".equals(obj)) {
                    return new k5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_group_exit is invalid. Received: ", obj));
            case 91:
                if ("layout/bottom_sheet_kyc_cancel_0".equals(obj)) {
                    return new m5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_kyc_cancel is invalid. Received: ", obj));
            case 92:
                if ("layout/bottom_sheet_kyc_mandatory_0".equals(obj)) {
                    return new o5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_kyc_mandatory is invalid. Received: ", obj));
            case 93:
                if ("layout/bottom_sheet_kyc_permission_0".equals(obj)) {
                    return new q5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_kyc_permission is invalid. Received: ", obj));
            case 94:
                if ("layout/bottom_sheet_kyc_retry_confirmation_0".equals(obj)) {
                    return new s5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_kyc_retry_confirmation is invalid. Received: ", obj));
            case 95:
                if ("layout/bottom_sheet_league_exit_0".equals(obj)) {
                    return new u5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_league_exit is invalid. Received: ", obj));
            case 96:
                if ("layout/bottom_sheet_league_report_0".equals(obj)) {
                    return new w5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_league_report is invalid. Received: ", obj));
            case 97:
                if ("layout/bottom_sheet_market_know_your_withdraw_limit_0".equals(obj)) {
                    return new y5(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_market_know_your_withdraw_limit is invalid. Received: ", obj));
            case 98:
                if ("layout/bottom_sheet_market_section_narration_0".equals(obj)) {
                    return new a6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_market_section_narration is invalid. Received: ", obj));
            case 99:
                if ("layout/bottom_sheet_message_0".equals(obj)) {
                    return new c6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_message is invalid. Received: ", obj));
            case 100:
                if ("layout/bottom_sheet_missions_home_0".equals(obj)) {
                    return new e6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_missions_home is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [m4.m, ba.m7, ba.n7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [ba.d8, m4.m, ba.c8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [m4.m, ba.n8, ba.o8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [ba.u9, m4.m, ba.t9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ba.s7, ba.t7, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ba.f7, m4.m, java.lang.Object, ba.g7] */
    public static m f(View view, int i10, Object obj) {
        switch (i10) {
            case 101:
                if ("layout/bottom_sheet_payment_withdrawal_otp_verify_0".equals(obj)) {
                    return new g6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_payment_withdrawal_otp_verify is invalid. Received: ", obj));
            case 102:
                if ("layout/bottom_sheet_social_action_confirmation_0".equals(obj)) {
                    return new i6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_social_action_confirmation is invalid. Received: ", obj));
            case 103:
                if ("layout/bottom_sheet_square_off_0".equals(obj)) {
                    return new k6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_square_off is invalid. Received: ", obj));
            case 104:
                if ("layout/bottom_sheet_subscribe_to_access_0".equals(obj)) {
                    return new m6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_subscribe_to_access is invalid. Received: ", obj));
            case 105:
                if ("layout/bottom_sheet_subscription_upgrade_plan_0".equals(obj)) {
                    return new o6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_subscription_upgrade_plan is invalid. Received: ", obj));
            case 106:
                if ("layout/bottom_sheet_subscription_upi_auto_pay_pre_confirmation_0".equals(obj)) {
                    return new q6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_subscription_upi_auto_pay_pre_confirmation is invalid. Received: ", obj));
            case 107:
                if ("layout/bottom_sheet_task_detail_0".equals(obj)) {
                    return new s6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_task_detail is invalid. Received: ", obj));
            case 108:
                if ("layout/bottom_sheet_wallet_announcement_action_0".equals(obj)) {
                    return new u6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_wallet_announcement_action is invalid. Received: ", obj));
            case 109:
                if ("layout/bottom_sheet_winner_declared_0".equals(obj)) {
                    return new w6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for bottom_sheet_winner_declared is invalid. Received: ", obj));
            case 110:
                if ("layout/cell_active_league_portfolio_sector_stock_0".equals(obj)) {
                    return new y6(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_active_league_portfolio_sector_stock is invalid. Received: ", obj));
            case 111:
                if ("layout/cell_active_prepzone_portfolio_options_0".equals(obj)) {
                    return new a7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_active_prepzone_portfolio_options is invalid. Received: ", obj));
            case 112:
                if ("layout/cell_advanced_search_options_0".equals(obj)) {
                    return new c7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_advanced_search_options is invalid. Received: ", obj));
            case 113:
                if ("layout/cell_advanced_search_stocks_0".equals(obj)) {
                    return new e7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_advanced_search_stocks is invalid. Received: ", obj));
            case 114:
                if ("layout/cell_all_top_portfolio_0".equals(obj)) {
                    Object[] j10 = m.j(view, 5, null, g7.f4782z);
                    ?? f7Var = new f7(null, view, (CardView) j10[0], (CrownImageView) j10[1], (TextView) j10[2], (StockChangeInfoView) j10[3], (MaterialButton) j10[4]);
                    f7Var.f4783y = -1L;
                    f7Var.f4679s.setTag(null);
                    view.setTag(R.id.dataBinding, f7Var);
                    f7Var.h();
                    return f7Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_all_top_portfolio is invalid. Received: ", obj));
            case 115:
                if ("layout/cell_arena_my_league_middle_layer_0".equals(obj)) {
                    return new i7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_arena_my_league_middle_layer is invalid. Received: ", obj));
            case 116:
                if ("layout/cell_arena_myleagues_recycler_0".equals(obj)) {
                    return new k7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_arena_myleagues_recycler is invalid. Received: ", obj));
            case 117:
                if ("layout/cell_arena_upcoming_header_0".equals(obj)) {
                    return new l7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_arena_upcoming_header is invalid. Received: ", obj));
            case 118:
                if ("layout/cell_arena_upcoming_middle_layer_0".equals(obj)) {
                    Object[] j11 = m.j(view, 10, null, n7.I);
                    TextView textView = (TextView) j11[7];
                    CircleIndicator2 circleIndicator2 = (CircleIndicator2) j11[6];
                    ImageView imageView = (ImageView) j11[5];
                    RecyclerView recyclerView = (RecyclerView) j11[4];
                    TextView textView2 = (TextView) j11[3];
                    TextView textView3 = (TextView) j11[2];
                    ConstraintLayout constraintLayout = (ConstraintLayout) j11[1];
                    ?? m7Var = new m7(null, view, textView, circleIndicator2, imageView, recyclerView, textView2, textView3, constraintLayout, (ConstraintLayout) j11[0], (PrepZoneWhatsNewWidget) j11[8]);
                    m7Var.H = -1L;
                    m7Var.f5440t.setTag(null);
                    m7Var.f5441u.setTag(null);
                    m7Var.f5442v.setTag(null);
                    m7Var.f5443w.setTag(null);
                    m7Var.f5444x.setTag(null);
                    m7Var.f5445y.setTag(null);
                    m7Var.f5446z.setTag(null);
                    view.setTag(R.id.dataBinding, m7Var);
                    m7Var.h();
                    return m7Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_arena_upcoming_middle_layer is invalid. Received: ", obj));
            case 119:
                if ("layout/cell_arena_upcoming_recycler_0".equals(obj)) {
                    return new p7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_arena_upcoming_recycler is invalid. Received: ", obj));
            case 120:
                if ("layout/cell_asset_insight_0".equals(obj)) {
                    return new r7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_asset_insight is invalid. Received: ", obj));
            case 121:
                if ("layout/cell_asset_insight_snapshot_0".equals(obj)) {
                    Object[] j12 = m.j(view, 4, null, t7.f6164y);
                    ?? s7Var = new s7(null, view, (LinearLayout) j12[0], (RecyclerView) j12[3], (TextView) j12[2], (TextView) j12[1]);
                    s7Var.f6165x = -1L;
                    s7Var.f6049s.setTag(null);
                    view.setTag(R.id.dataBinding, s7Var);
                    s7Var.h();
                    return s7Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_asset_insight_snapshot is invalid. Received: ", obj));
            case 122:
                if ("layout/cell_attach_proof_image_0".equals(obj)) {
                    return new v7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_attach_proof_image is invalid. Received: ", obj));
            case 123:
                if ("layout/cell_block_user_0".equals(obj)) {
                    return new x7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_block_user is invalid. Received: ", obj));
            case 124:
                if ("layout/cell_bottom_sheet_options_0".equals(obj)) {
                    return new z7(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_bottom_sheet_options is invalid. Received: ", obj));
            case 125:
                if ("layout/cell_champion_0".equals(obj)) {
                    return new b8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_champion is invalid. Received: ", obj));
            case 126:
                if ("layout/cell_chat_media_text_consolidated_view_0".equals(obj)) {
                    Object[] j13 = m.j(view, 4, d8.f4458x, null);
                    ?? c8Var = new c8(null, view, (LinearLayout) j13[0], (hx) j13[2], (jx) j13[1], (lx) j13[3]);
                    c8Var.f4459w = -1L;
                    c8Var.f4341s.setTag(null);
                    hx hxVar = c8Var.f4342t;
                    if (hxVar != null) {
                        hxVar.f27496j = c8Var;
                    }
                    jx jxVar = c8Var.f4343u;
                    if (jxVar != null) {
                        jxVar.f27496j = c8Var;
                    }
                    lx lxVar = c8Var.f4344v;
                    if (lxVar != null) {
                        lxVar.f27496j = c8Var;
                    }
                    view.setTag(R.id.dataBinding, c8Var);
                    c8Var.h();
                    return c8Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_chat_media_text_consolidated_view is invalid. Received: ", obj));
            case 127:
                if ("layout/cell_chat_parent_message_0".equals(obj)) {
                    return new f8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_chat_parent_message is invalid. Received: ", obj));
            case 128:
                if ("layout/cell_compose_0".equals(obj)) {
                    return new g8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_compose is invalid. Received: ", obj));
            case 129:
                if ("layout/cell_confirm_withdrawal_0".equals(obj)) {
                    return new i8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_confirm_withdrawal is invalid. Received: ", obj));
            case 130:
                if ("layout/cell_country_select_0".equals(obj)) {
                    return new k8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_country_select is invalid. Received: ", obj));
            case 131:
                if ("layout/cell_discover_category_snapshot_0".equals(obj)) {
                    return new m8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_discover_category_snapshot is invalid. Received: ", obj));
            case 132:
                if ("layout/cell_exit_chat_options_0".equals(obj)) {
                    Object[] j14 = m.j(view, 4, null, o8.f5649y);
                    ?? n8Var = new n8(null, view, (CheckBox) j14[1], (ConstraintLayout) j14[0], (TextView) j14[2], (EditText) j14[3]);
                    n8Var.f5650x = -1L;
                    n8Var.f5530t.setTag(null);
                    view.setTag(R.id.dataBinding, n8Var);
                    n8Var.h();
                    return n8Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_exit_chat_options is invalid. Received: ", obj));
            case 133:
                if ("layout/cell_featured_groups_0".equals(obj)) {
                    return new q8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_featured_groups is invalid. Received: ", obj));
            case 134:
                if ("layout/cell_follower_following_0".equals(obj)) {
                    return new s8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_follower_following is invalid. Received: ", obj));
            case 135:
                if ("layout/cell_friend_image_title_0".equals(obj)) {
                    return new u8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_friend_image_title is invalid. Received: ", obj));
            case 136:
                if ("layout/cell_frozen_portfolio_options_0".equals(obj)) {
                    return new w8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_frozen_portfolio_options is invalid. Received: ", obj));
            case 137:
                if ("layout/cell_frozen_portfolio_stocks_0".equals(obj)) {
                    return new y8(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_frozen_portfolio_stocks is invalid. Received: ", obj));
            case 138:
                if ("layout/cell_image_viewer_item_0".equals(obj)) {
                    return new a9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_image_viewer_item is invalid. Received: ", obj));
            case 139:
                if ("layout/cell_inner_follower_following_0".equals(obj)) {
                    return new c9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_inner_follower_following is invalid. Received: ", obj));
            case 140:
                if ("layout/cell_invite_contact_0".equals(obj)) {
                    return new e9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_invite_contact is invalid. Received: ", obj));
            case 141:
                if ("layout/cell_invited_friend_0".equals(obj)) {
                    return new g9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_invited_friend is invalid. Received: ", obj));
            case 142:
                if ("layout/cell_kyc_faq_0".equals(obj)) {
                    return new i9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_kyc_faq is invalid. Received: ", obj));
            case 143:
                if ("layout/cell_kyc_message_0".equals(obj)) {
                    return new k9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_kyc_message is invalid. Received: ", obj));
            case 144:
                if ("layout/cell_league_declared_winner_board_0".equals(obj)) {
                    return new m9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_declared_winner_board is invalid. Received: ", obj));
            case 145:
                if ("layout/cell_league_leader_board_0".equals(obj)) {
                    return new o9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_leader_board is invalid. Received: ", obj));
            case 146:
                if ("layout/cell_league_portfolio_0".equals(obj)) {
                    return new q9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_portfolio is invalid. Received: ", obj));
            case 147:
                if ("layout/cell_league_rule_0".equals(obj)) {
                    return new s9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_rule is invalid. Received: ", obj));
            case 148:
                if ("layout/cell_league_rule_v2_0".equals(obj)) {
                    Object[] j15 = m.j(view, 3, null, u9.f6282w);
                    ?? t9Var = new t9(view, (ConstraintLayout) j15[0], (TextView) j15[1], (TextView) j15[2], (Object) null);
                    t9Var.f6283v = -1L;
                    ((ConstraintLayout) t9Var.f6172u).setTag(null);
                    view.setTag(R.id.dataBinding, t9Var);
                    t9Var.h();
                    return t9Var;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_rule_v2 is invalid. Received: ", obj));
            case 149:
                if ("layout/cell_league_upcoming_0".equals(obj)) {
                    return new w9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_upcoming is invalid. Received: ", obj));
            case 150:
                if ("layout/cell_league_upcoming_league_info_0".equals(obj)) {
                    return new y9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_upcoming_league_info is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [m4.m, ba.kc, ba.jc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [m4.m, java.lang.Object, ba.rb, ba.sb] */
    /* JADX WARN: Type inference failed for: r10v4, types: [m4.m, ba.vb, java.lang.Object, ba.wb] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ba.nd, m4.m, ba.md, java.lang.Object] */
    public static m g(View view, int i10, Object obj) {
        switch (i10) {
            case 151:
                if ("layout/cell_league_upcoming_title_0".equals(obj)) {
                    return new z9(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_upcoming_title is invalid. Received: ", obj));
            case 152:
                if ("layout/cell_league_winner_0".equals(obj)) {
                    return new ba(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_league_winner is invalid. Received: ", obj));
            case 153:
                if ("layout/cell_maintenance_view_0".equals(obj)) {
                    return new da(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_maintenance_view is invalid. Received: ", obj));
            case 154:
                if ("layout/cell_market_sentiment_0".equals(obj)) {
                    return new ea(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_market_sentiment is invalid. Received: ", obj));
            case 155:
                if ("layout/cell_mission_history_0".equals(obj)) {
                    return new ga(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_mission_history is invalid. Received: ", obj));
            case 156:
                if ("layout/cell_mission_history_timeline_0".equals(obj)) {
                    return new ia(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_mission_history_timeline is invalid. Received: ", obj));
            case 157:
                if ("layout/cell_mission_info_0".equals(obj)) {
                    return new ka(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_mission_info is invalid. Received: ", obj));
            case 158:
                if ("layout/cell_model_portfolio_0".equals(obj)) {
                    return new ma(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_model_portfolio is invalid. Received: ", obj));
            case 159:
                if ("layout/cell_my_league_header_layout_0".equals(obj)) {
                    return new oa(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_my_league_header_layout is invalid. Received: ", obj));
            case 160:
                if ("layout/cell_my_league_v2_0".equals(obj)) {
                    return new qa(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_my_league_v2 is invalid. Received: ", obj));
            case 161:
                if ("layout/cell_my_league_v2_coming_soon_0".equals(obj)) {
                    return new sa(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_my_league_v2_coming_soon is invalid. Received: ", obj));
            case 162:
                if ("layout/cell_my_league_v2_completed_0".equals(obj)) {
                    return new ua(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_my_league_v2_completed is invalid. Received: ", obj));
            case 163:
                if ("layout/cell_notification_0".equals(obj)) {
                    return new wa(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_notification is invalid. Received: ", obj));
            case 164:
                if ("layout/cell_notification_category_0".equals(obj)) {
                    return new ya(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_notification_category is invalid. Received: ", obj));
            case 165:
                if ("layout/cell_option_0".equals(obj)) {
                    return new ab(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_option is invalid. Received: ", obj));
            case 166:
                if ("layout/cell_option_chain_0".equals(obj)) {
                    return new cb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_option_chain is invalid. Received: ", obj));
            case 167:
                if ("layout/cell_person_image_title_menu_0".equals(obj)) {
                    return new eb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_person_image_title_menu is invalid. Received: ", obj));
            case 168:
                if ("layout/cell_pinned_message_0".equals(obj)) {
                    return new gb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_pinned_message is invalid. Received: ", obj));
            case 169:
                if ("layout/cell_plan_overview_0".equals(obj)) {
                    return new ib(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_plan_overview is invalid. Received: ", obj));
            case 170:
                if ("layout/cell_portfolio_sector_stock_0".equals(obj)) {
                    return new kb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_portfolio_sector_stock is invalid. Received: ", obj));
            case 171:
                if ("layout/cell_portfolio_stock_history_0".equals(obj)) {
                    return new mb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_portfolio_stock_history is invalid. Received: ", obj));
            case 172:
                if ("layout/cell_portfolio_stock_holding_0".equals(obj)) {
                    return new ob(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_portfolio_stock_holding is invalid. Received: ", obj));
            case 173:
                if ("layout/cell_portfolio_stock_order_0".equals(obj)) {
                    return new qb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_portfolio_stock_order is invalid. Received: ", obj));
            case 174:
                if ("layout/cell_portfolio_unlock_0".equals(obj)) {
                    Object[] j10 = m.j(view, 11, null, sb.f6057z);
                    CardView cardView = (CardView) j10[0];
                    RelativeLayout relativeLayout = (RelativeLayout) j10[10];
                    TextView textView = (TextView) j10[8];
                    TextView textView2 = (TextView) j10[1];
                    TextView textView3 = (TextView) j10[4];
                    ?? rbVar = new rb(null, view, cardView, relativeLayout, textView, textView2, textView3);
                    rbVar.f6058y = -1L;
                    rbVar.f5952s.setTag(null);
                    view.setTag(R.id.dataBinding, rbVar);
                    rbVar.h();
                    return rbVar;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_portfolio_unlock is invalid. Received: ", obj));
            case 175:
                if ("layout/cell_post_attach_document_0".equals(obj)) {
                    return new tb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_post_attach_document is invalid. Received: ", obj));
            case 176:
                if ("layout/cell_post_image_item_0".equals(obj)) {
                    return new ub(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_post_image_item is invalid. Received: ", obj));
            case 177:
                if ("layout/cell_prize_distribution_0".equals(obj)) {
                    Object[] j11 = m.j(view, 6, null, wb.f6517z);
                    TextView textView4 = (TextView) j11[3];
                    RelativeLayout relativeLayout2 = (RelativeLayout) j11[0];
                    TextView textView5 = (TextView) j11[5];
                    ?? vbVar = new vb(null, view, textView4, relativeLayout2, textView5, (ImageView) j11[4], (ImageView) j11[2]);
                    vbVar.f6518y = -1L;
                    vbVar.f6419t.setTag(null);
                    view.setTag(R.id.dataBinding, vbVar);
                    vbVar.h();
                    return vbVar;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_prize_distribution is invalid. Received: ", obj));
            case 178:
                if ("layout/cell_recent_performance_0".equals(obj)) {
                    return new yb(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_recent_performance is invalid. Received: ", obj));
            case 179:
                if ("layout/cell_redeemed_offers_0".equals(obj)) {
                    return new ac(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_redeemed_offers is invalid. Received: ", obj));
            case 180:
                if ("layout/cell_redemption_offer_0".equals(obj)) {
                    return new cc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_redemption_offer is invalid. Received: ", obj));
            case 181:
                if ("layout/cell_ria_basic_info_0".equals(obj)) {
                    return new ec(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_ria_basic_info is invalid. Received: ", obj));
            case 182:
                if ("layout/cell_ria_expertise_0".equals(obj)) {
                    return new gc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_ria_expertise is invalid. Received: ", obj));
            case 183:
                if ("layout/cell_ria_outline_0".equals(obj)) {
                    return new ic(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_ria_outline is invalid. Received: ", obj));
            case 184:
                if ("layout/cell_social_chat_group_item_0".equals(obj)) {
                    Object[] j12 = m.j(view, 13, null, kc.f5215u);
                    ConstraintLayout constraintLayout = (ConstraintLayout) j12[0];
                    ?? jcVar = new jc(null, view, constraintLayout);
                    jcVar.f5216t = -1L;
                    jcVar.f5138s.setTag(null);
                    view.setTag(R.id.dataBinding, jcVar);
                    jcVar.h();
                    return jcVar;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_social_chat_group_item is invalid. Received: ", obj));
            case 185:
                if ("layout/cell_social_groups_0".equals(obj)) {
                    return new mc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_social_groups is invalid. Received: ", obj));
            case 186:
                if ("layout/cell_social_search_groups_0".equals(obj)) {
                    return new oc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_social_search_groups is invalid. Received: ", obj));
            case 187:
                if ("layout/cell_social_search_history_0".equals(obj)) {
                    return new qc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_social_search_history is invalid. Received: ", obj));
            case 188:
                if ("layout/cell_social_search_users_0".equals(obj)) {
                    return new sc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_social_search_users is invalid. Received: ", obj));
            case 189:
                if ("layout/cell_stock_0".equals(obj)) {
                    return new wc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock is invalid. Received: ", obj));
            case 190:
                if ("layout/cell_stock_analysis_0".equals(obj)) {
                    return new uc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_analysis is invalid. Received: ", obj));
            case 191:
                if ("layout/cell_stock_gyan_card_0".equals(obj)) {
                    return new yc(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_gyan_card is invalid. Received: ", obj));
            case 192:
                if ("layout/cell_stock_gyan_group_0".equals(obj)) {
                    return new ad(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_gyan_group is invalid. Received: ", obj));
            case 193:
                if ("layout/cell_stock_holdings_pie_chart_view_0".equals(obj)) {
                    return new cd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_holdings_pie_chart_view is invalid. Received: ", obj));
            case 194:
                if ("layout/cell_stock_overview_section_0".equals(obj)) {
                    return new fd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_overview_section is invalid. Received: ", obj));
            case 195:
                if ("layout/cell_stock_sort_0".equals(obj)) {
                    return new hd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_stock_sort is invalid. Received: ", obj));
            case 196:
                if ("layout/cell_subscription_bulletin_nudge_0".equals(obj)) {
                    return new jd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_subscription_bulletin_nudge is invalid. Received: ", obj));
            case 197:
                if ("layout/cell_subscription_plan_detail_0".equals(obj)) {
                    return new ld(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_subscription_plan_detail is invalid. Received: ", obj));
            case 198:
                if ("layout/cell_top_group_0".equals(obj)) {
                    Object[] j13 = m.j(view, 7, null, nd.A);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j13[0];
                    ImageView imageView = (ImageView) j13[1];
                    TextView textView6 = (TextView) j13[3];
                    TextView textView7 = (TextView) j13[2];
                    ?? mdVar = new md(null, view, constraintLayout2, imageView, textView6, textView7, (TextView) j13[4]);
                    mdVar.f5562z = -1L;
                    mdVar.f5453s.setTag(null);
                    mdVar.f5454t.setTag(null);
                    mdVar.f5455u.setTag(null);
                    mdVar.f5456v.setTag(null);
                    mdVar.f5457w.setTag(null);
                    view.setTag(R.id.dataBinding, mdVar);
                    mdVar.h();
                    return mdVar;
                }
                throw new IllegalArgumentException(h.q("The tag for cell_top_group is invalid. Received: ", obj));
            case 199:
                if ("layout/cell_tutorial_0".equals(obj)) {
                    return new pd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_tutorial is invalid. Received: ", obj));
            case 200:
                if ("layout/cell_unlock_portfolio_expiry_option_0".equals(obj)) {
                    return new rd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_unlock_portfolio_expiry_option is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [m4.m, ba.me, ba.ne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [m4.m, java.lang.Object, ba.we, ba.xe] */
    /* JADX WARN: Type inference failed for: r0v40, types: [m4.m, ba.ye, java.lang.Object, ba.ze] */
    /* JADX WARN: Type inference failed for: r0v43, types: [ba.bf, m4.m, ba.af, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [m4.m, java.lang.Object, ba.hf, ba.gf] */
    /* JADX WARN: Type inference failed for: r0v70, types: [m4.m, ba.lf, java.lang.Object, ba.kf] */
    /* JADX WARN: Type inference failed for: r0v8, types: [m4.m, ba.zd, java.lang.Object, ba.yd] */
    /* JADX WARN: Type inference failed for: r6v14, types: [ba.qe, ba.re, m4.m, java.lang.Object] */
    public static m h(View view, int i10, Object obj) {
        switch (i10) {
            case 201:
                if ("layout/cell_wallet_transactions_0".equals(obj)) {
                    return new td(view);
                }
                throw new IllegalArgumentException(h.q("The tag for cell_wallet_transactions is invalid. Received: ", obj));
            case 202:
                if ("layout/compose_bottom_sheet_0".equals(obj)) {
                    return new vd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for compose_bottom_sheet is invalid. Received: ", obj));
            case 203:
                if ("layout/content_main_activity_0".equals(obj)) {
                    return new xd(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_main_activity is invalid. Received: ", obj));
            case 204:
                if ("layout/content_media_container_0".equals(obj)) {
                    Object[] j10 = m.j(view, 14, null, zd.f6843u);
                    LinearLayout linearLayout = (LinearLayout) j10[0];
                    ?? ydVar = new yd(null, view, linearLayout);
                    ydVar.f6844t = -1L;
                    ydVar.f6717s.setTag(null);
                    view.setTag(R.id.dataBinding, ydVar);
                    ydVar.h();
                    return ydVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_media_container is invalid. Received: ", obj));
            case 205:
                if ("layout/content_missions_home_bottom_sheet_0".equals(obj)) {
                    return new be(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_missions_home_bottom_sheet is invalid. Received: ", obj));
            case 206:
                if ("layout/content_modify_order_confirmation_0".equals(obj)) {
                    return new de(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_modify_order_confirmation is invalid. Received: ", obj));
            case 207:
                if ("layout/content_modify_short_sell_order_confirmation_0".equals(obj)) {
                    return new fe(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_modify_short_sell_order_confirmation is invalid. Received: ", obj));
            case 208:
                if ("layout/content_modify_stock_cover_order_confirmation_0".equals(obj)) {
                    return new he(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_modify_stock_cover_order_confirmation is invalid. Received: ", obj));
            case 209:
                if ("layout/content_navigation_drawer_header_0".equals(obj)) {
                    return new je(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_navigation_drawer_header is invalid. Received: ", obj));
            case 210:
                if ("layout/content_navigation_drawer_items_0".equals(obj)) {
                    return new le(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_navigation_drawer_items is invalid. Received: ", obj));
            case 211:
                if ("layout/content_offer_details_0".equals(obj)) {
                    Object[] j11 = m.j(view, 27, null, ne.L);
                    ConstraintLayout constraintLayout = (ConstraintLayout) j11[22];
                    MaterialButton materialButton = (MaterialButton) j11[26];
                    TextView textView = (TextView) j11[9];
                    TextView textView2 = (TextView) j11[11];
                    TextView textView3 = (TextView) j11[4];
                    TextView textView4 = (TextView) j11[18];
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j11[20];
                    TextView textView5 = (TextView) j11[21];
                    TextView textView6 = (TextView) j11[3];
                    TextView textView7 = (TextView) j11[2];
                    MaterialButton materialButton2 = (MaterialButton) j11[25];
                    NestedScrollView nestedScrollView = (NestedScrollView) j11[0];
                    CheckBox checkBox = (CheckBox) j11[23];
                    TextView textView8 = (TextView) j11[24];
                    TextView textView9 = (TextView) j11[7];
                    ?? meVar = new me(null, view, constraintLayout, materialButton, textView, textView2, textView3, textView4, constraintLayout2, textView5, textView6, textView7, materialButton2, nestedScrollView, checkBox, textView8, textView9, (TextView) j11[15], (TextView) j11[17], (LinearLayout) j11[12]);
                    meVar.K = -1L;
                    meVar.D.setTag(null);
                    view.setTag(R.id.dataBinding, meVar);
                    meVar.h();
                    return meVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_offer_details is invalid. Received: ", obj));
            case 212:
                if ("layout/content_redeemed_offers_0".equals(obj)) {
                    return new pe(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_redeemed_offers is invalid. Received: ", obj));
            case 213:
                if ("layout/content_redemption_offers_list_0".equals(obj)) {
                    Object[] j12 = m.j(view, 5, null, re.f5963w);
                    ?? qeVar = new qe(null, view, (ConstraintLayout) j12[2], (RecyclerView) j12[4], (SwipeRefreshLayout) j12[0]);
                    qeVar.f5964v = -1L;
                    qeVar.f5854u.setTag(null);
                    view.setTag(R.id.dataBinding, qeVar);
                    qeVar.h();
                    return qeVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_redemption_offers_list is invalid. Received: ", obj));
            case 214:
                if ("layout/content_social_0".equals(obj)) {
                    return new te(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_social is invalid. Received: ", obj));
            case 215:
                if ("layout/content_stock_0".equals(obj)) {
                    return new ve(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock is invalid. Received: ", obj));
            case 216:
                if ("layout/content_stock_modify_buy_order_0".equals(obj)) {
                    Object[] j13 = m.j(view, 22, null, xe.L);
                    PriceInputView priceInputView = (PriceInputView) j13[19];
                    InputView inputView = (InputView) j13[17];
                    InputView inputView2 = (InputView) j13[18];
                    CheckBox checkBox2 = (CheckBox) j13[11];
                    TextView textView10 = (TextView) j13[12];
                    LinearLayout linearLayout2 = (LinearLayout) j13[13];
                    InputView inputView3 = (InputView) j13[4];
                    TextView textView11 = (TextView) j13[3];
                    TextView textView12 = (TextView) j13[1];
                    PriceInputView priceInputView2 = (PriceInputView) j13[6];
                    CheckBox checkBox3 = (CheckBox) j13[9];
                    TextView textView13 = (TextView) j13[10];
                    NestedScrollView nestedScrollView2 = (NestedScrollView) j13[0];
                    InputView inputView4 = (InputView) j13[5];
                    PriceInputView priceInputView3 = (PriceInputView) j13[16];
                    InputView inputView5 = (InputView) j13[14];
                    InputView inputView6 = (InputView) j13[15];
                    PriceInputView priceInputView4 = (PriceInputView) j13[7];
                    ?? weVar = new we(null, view, priceInputView, inputView, inputView2, checkBox2, textView10, linearLayout2, inputView3, textView11, textView12, priceInputView2, checkBox3, textView13, nestedScrollView2, inputView4, priceInputView3, inputView5, inputView6, priceInputView4);
                    weVar.K = -1L;
                    weVar.E.setTag(null);
                    view.setTag(R.id.dataBinding, weVar);
                    weVar.h();
                    return weVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_modify_buy_order is invalid. Received: ", obj));
            case 217:
                if ("layout/content_stock_modify_short_sell_order_0".equals(obj)) {
                    Object[] j14 = m.j(view, 24, null, ze.N);
                    PriceInputView priceInputView5 = (PriceInputView) j14[21];
                    InputView inputView7 = (InputView) j14[19];
                    InputView inputView8 = (InputView) j14[20];
                    CheckBox checkBox4 = (CheckBox) j14[13];
                    TextView textView14 = (TextView) j14[14];
                    LinearLayout linearLayout3 = (LinearLayout) j14[15];
                    InputView inputView9 = (InputView) j14[6];
                    TextView textView15 = (TextView) j14[4];
                    TextView textView16 = (TextView) j14[2];
                    Spinner spinner = (Spinner) j14[1];
                    PriceInputView priceInputView6 = (PriceInputView) j14[8];
                    CheckBox checkBox5 = (CheckBox) j14[11];
                    TextView textView17 = (TextView) j14[12];
                    ChipView chipView = (ChipView) j14[5];
                    NestedScrollView nestedScrollView3 = (NestedScrollView) j14[0];
                    InputView inputView10 = (InputView) j14[7];
                    PriceInputView priceInputView7 = (PriceInputView) j14[18];
                    InputView inputView11 = (InputView) j14[16];
                    InputView inputView12 = (InputView) j14[17];
                    PriceInputView priceInputView8 = (PriceInputView) j14[9];
                    ?? yeVar = new ye(null, view, priceInputView5, inputView7, inputView8, checkBox4, textView14, linearLayout3, inputView9, textView15, textView16, spinner, priceInputView6, checkBox5, textView17, chipView, nestedScrollView3, inputView10, priceInputView7, inputView11, inputView12, priceInputView8);
                    yeVar.M = -1L;
                    yeVar.G.setTag(null);
                    view.setTag(R.id.dataBinding, yeVar);
                    yeVar.h();
                    return yeVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_modify_short_sell_order is invalid. Received: ", obj));
            case 218:
                if ("layout/content_stock_order_0".equals(obj)) {
                    Object[] j15 = m.j(view, 26, null, bf.Q);
                    PriceInputView priceInputView9 = (PriceInputView) j15[23];
                    InputView inputView13 = (InputView) j15[21];
                    InputView inputView14 = (InputView) j15[22];
                    CheckBox checkBox6 = (CheckBox) j15[15];
                    TextView textView18 = (TextView) j15[16];
                    LinearLayout linearLayout4 = (LinearLayout) j15[17];
                    LinearLayout linearLayout5 = (LinearLayout) j15[1];
                    InputView inputView15 = (InputView) j15[8];
                    TextView textView19 = (TextView) j15[7];
                    TextView textView20 = (TextView) j15[5];
                    TextView textView21 = (TextView) j15[4];
                    ImageView imageView = (ImageView) j15[3];
                    Spinner spinner2 = (Spinner) j15[2];
                    PriceInputView priceInputView10 = (PriceInputView) j15[10];
                    InputView inputView16 = (InputView) j15[24];
                    CheckBox checkBox7 = (CheckBox) j15[13];
                    TextView textView22 = (TextView) j15[14];
                    NestedScrollView nestedScrollView4 = (NestedScrollView) j15[0];
                    InputView inputView17 = (InputView) j15[9];
                    PriceInputView priceInputView11 = (PriceInputView) j15[20];
                    InputView inputView18 = (InputView) j15[18];
                    InputView inputView19 = (InputView) j15[19];
                    PriceInputView priceInputView12 = (PriceInputView) j15[11];
                    ?? afVar = new af(null, view, priceInputView9, inputView13, inputView14, checkBox6, textView18, linearLayout4, linearLayout5, inputView15, textView19, textView20, textView21, imageView, spinner2, priceInputView10, inputView16, checkBox7, textView22, nestedScrollView4, inputView17, priceInputView11, inputView18, inputView19, priceInputView12);
                    afVar.P = -1L;
                    afVar.J.setTag(null);
                    view.setTag(R.id.dataBinding, afVar);
                    afVar.h();
                    return afVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_order is invalid. Received: ", obj));
            case 219:
                if ("layout/content_stock_order_confirmation_0".equals(obj)) {
                    return new df(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_order_confirmation is invalid. Received: ", obj));
            case 220:
                if ("layout/content_stock_short_sell_confirmation_0".equals(obj)) {
                    return new ff(view);
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_short_sell_confirmation is invalid. Received: ", obj));
            case 221:
                if ("layout/content_stock_short_sell_order_0".equals(obj)) {
                    Object[] j16 = m.j(view, 28, null, hf.R);
                    PriceInputView priceInputView13 = (PriceInputView) j16[25];
                    InputView inputView20 = (InputView) j16[23];
                    InputView inputView21 = (InputView) j16[24];
                    CheckBox checkBox8 = (CheckBox) j16[17];
                    TextView textView23 = (TextView) j16[18];
                    LinearLayout linearLayout6 = (LinearLayout) j16[19];
                    LinearLayout linearLayout7 = (LinearLayout) j16[1];
                    InputView inputView22 = (InputView) j16[10];
                    TextView textView24 = (TextView) j16[8];
                    TextView textView25 = (TextView) j16[5];
                    TextView textView26 = (TextView) j16[4];
                    ImageView imageView2 = (ImageView) j16[3];
                    Spinner spinner3 = (Spinner) j16[2];
                    PriceInputView priceInputView14 = (PriceInputView) j16[12];
                    InputView inputView23 = (InputView) j16[26];
                    CheckBox checkBox9 = (CheckBox) j16[15];
                    TextView textView27 = (TextView) j16[16];
                    ChipView chipView2 = (ChipView) j16[9];
                    NestedScrollView nestedScrollView5 = (NestedScrollView) j16[0];
                    InputView inputView24 = (InputView) j16[11];
                    PriceInputView priceInputView15 = (PriceInputView) j16[22];
                    InputView inputView25 = (InputView) j16[20];
                    InputView inputView26 = (InputView) j16[21];
                    PriceInputView priceInputView16 = (PriceInputView) j16[13];
                    ?? gfVar = new gf(null, view, priceInputView13, inputView20, inputView21, checkBox8, textView23, linearLayout6, linearLayout7, inputView22, textView24, textView25, textView26, imageView2, spinner3, priceInputView14, inputView23, checkBox9, textView27, chipView2, nestedScrollView5, inputView24, priceInputView15, inputView25, inputView26, priceInputView16);
                    gfVar.Q = -1L;
                    gfVar.K.setTag(null);
                    view.setTag(R.id.dataBinding, gfVar);
                    gfVar.h();
                    return gfVar;
                }
                throw new IllegalArgumentException(h.q("The tag for content_stock_short_sell_order is invalid. Received: ", obj));
            case 222:
                if ("layout/custom_alert_dialog_0".equals(obj)) {
                    return new jf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for custom_alert_dialog is invalid. Received: ", obj));
            case 223:
                if ("layout/customkeyboard_0".equals(obj)) {
                    Object[] j17 = m.j(view, 14, null, lf.I);
                    ?? kfVar = new kf(null, view, (TextView) j17[12], (TextView) j17[2], (TextView) j17[3], (TextView) j17[4], (TextView) j17[5], (TextView) j17[6], (TextView) j17[7], (TextView) j17[8], (TextView) j17[9], (TextView) j17[10], (ImageButton) j17[11], (ImageButton) j17[13], (TableLayout) j17[1], (LinearLayout) j17[0]);
                    kfVar.H = -1L;
                    kfVar.F.setTag(null);
                    view.setTag(R.id.dataBinding, kfVar);
                    kfVar.h();
                    return kfVar;
                }
                throw new IllegalArgumentException(h.q("The tag for customkeyboard is invalid. Received: ", obj));
            case 224:
                if ("layout/fragment_arena_asset_host_0".equals(obj)) {
                    return new nf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_arena_asset_host is invalid. Received: ", obj));
            case 225:
                if ("layout/fragment_arena_asset_host_v2_0".equals(obj)) {
                    return new pf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_arena_asset_host_v2 is invalid. Received: ", obj));
            case 226:
                if ("layout/fragment_arena_my_leagues_host_0".equals(obj)) {
                    return new rf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_arena_my_leagues_host is invalid. Received: ", obj));
            case 227:
                if ("layout/fragment_arena_upcoming_host_0".equals(obj)) {
                    return new tf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_arena_upcoming_host is invalid. Received: ", obj));
            case 228:
                if ("layout/fragment_bottom_sheet_0".equals(obj)) {
                    return new xf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet is invalid. Received: ", obj));
            case 229:
                if ("layout/fragment_bottom_sheet_alert_0".equals(obj)) {
                    return new vf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_alert is invalid. Received: ", obj));
            case 230:
                if ("layout/fragment_bottom_sheet_filter_0".equals(obj)) {
                    return new yf(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_filter is invalid. Received: ", obj));
            case 231:
                if ("layout/fragment_bottom_sheet_invitation_response_0".equals(obj)) {
                    return new ag(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_invitation_response is invalid. Received: ", obj));
            case 232:
                if ("layout/fragment_bottom_sheet_notifications_filter_0".equals(obj)) {
                    return new cg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_notifications_filter is invalid. Received: ", obj));
            case 233:
                if ("layout/fragment_bottom_sheet_photo_select_0".equals(obj)) {
                    return new eg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_photo_select is invalid. Received: ", obj));
            case 234:
                if ("layout/fragment_bottom_sheet_rename_portfolio_0".equals(obj)) {
                    return new gg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_rename_portfolio is invalid. Received: ", obj));
            case 235:
                if ("layout/fragment_bottom_sheet_reset_portfolio_0".equals(obj)) {
                    return new ig(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_reset_portfolio is invalid. Received: ", obj));
            case 236:
                if ("layout/fragment_bottom_sheet_unlock_portfolio_0".equals(obj)) {
                    return new jg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_bottom_sheet_unlock_portfolio is invalid. Received: ", obj));
            case 237:
                if ("layout/fragment_center_popup_dialog_0".equals(obj)) {
                    return new lg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_center_popup_dialog is invalid. Received: ", obj));
            case 238:
                if ("layout/fragment_clear_search_history_bottom_sheet_0".equals(obj)) {
                    return new ng(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_clear_search_history_bottom_sheet is invalid. Received: ", obj));
            case 239:
                if ("layout/fragment_community_guidelines_0".equals(obj)) {
                    return new pg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_community_guidelines is invalid. Received: ", obj));
            case 240:
                if ("layout/fragment_completed_league_0".equals(obj)) {
                    return new rg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_completed_league is invalid. Received: ", obj));
            case 241:
                if ("layout/fragment_confirm_payment_dialog_0".equals(obj)) {
                    return new tg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_confirm_payment_dialog is invalid. Received: ", obj));
            case 242:
                if ("layout/fragment_create_social_group_0".equals(obj)) {
                    return new vg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_create_social_group is invalid. Received: ", obj));
            case 243:
                if ("layout/fragment_delete_account_bottom_sheet_0".equals(obj)) {
                    return new xg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_delete_account_bottom_sheet is invalid. Received: ", obj));
            case 244:
                if ("layout/fragment_dialog_breakeven_chart_0".equals(obj)) {
                    return new zg(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_dialog_breakeven_chart is invalid. Received: ", obj));
            case 245:
                if ("layout/fragment_enter_pin_delete_0".equals(obj)) {
                    return new bh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_enter_pin_delete is invalid. Received: ", obj));
            case 246:
                if ("layout/fragment_exit_chat_dialog_0".equals(obj)) {
                    return new dh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_exit_chat_dialog is invalid. Received: ", obj));
            case 247:
                if ("layout/fragment_feed_stream_0".equals(obj)) {
                    return new fh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_feed_stream is invalid. Received: ", obj));
            case 248:
                if ("layout/fragment_feed_stream_compose_0".equals(obj)) {
                    return new hh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_feed_stream_compose is invalid. Received: ", obj));
            case 249:
                if ("layout/fragment_filter_recent_performance_bottom_sheet_0".equals(obj)) {
                    return new jh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_filter_recent_performance_bottom_sheet is invalid. Received: ", obj));
            case 250:
                if ("layout/fragment_fno_option_chain_0".equals(obj)) {
                    return new lh(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_fno_option_chain is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [m4.m, ba.tn, java.lang.Object, ba.sn] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ba.im, ba.jm, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [m4.m, java.lang.Object, ba.mm, ba.nm] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ba.hl, ba.il, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [m4.m, java.lang.Object, ba.qo, ba.po] */
    public static m i(View view, int i10, Object obj) {
        switch (i10) {
            case 301:
                if ("layout/fragment_name_register_0".equals(obj)) {
                    Object[] j10 = m.j(view, 6, null, il.f5057x);
                    InputView inputView = (InputView) j10[3];
                    ?? hlVar = new hl(null, view, inputView, (ConstraintLayout) j10[0], (MaterialButton) j10[4], (TnCLinkView) j10[5]);
                    hlVar.f5058w = -1L;
                    hlVar.f4952t.setTag(null);
                    view.setTag(R.id.dataBinding, hlVar);
                    hlVar.h();
                    return hlVar;
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_name_register is invalid. Received: ", obj));
            case 302:
                if ("layout/fragment_option_order_detail_bottom_sheet_0".equals(obj)) {
                    return new kl(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_option_order_detail_bottom_sheet is invalid. Received: ", obj));
            case 303:
                if ("layout/fragment_option_pending_order_0".equals(obj)) {
                    return new ml(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_option_pending_order is invalid. Received: ", obj));
            case 304:
                if ("layout/fragment_other_subscription_plans_0".equals(obj)) {
                    return new ol(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_other_subscription_plans is invalid. Received: ", obj));
            case 305:
                if ("layout/fragment_otp_entry_verification_0".equals(obj)) {
                    return new ql(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_otp_entry_verification is invalid. Received: ", obj));
            case 306:
                if ("layout/fragment_payment_abort_transaction_bottom_sheet_0".equals(obj)) {
                    return new sl(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_payment_abort_transaction_bottom_sheet is invalid. Received: ", obj));
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                if ("layout/fragment_payment_status_bottom_sheet_0".equals(obj)) {
                    return new ul(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_payment_status_bottom_sheet is invalid. Received: ", obj));
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                if ("layout/fragment_pin_login_0".equals(obj)) {
                    return new xl(view);
                }
                if ("layout-h640dp/fragment_pin_login_0".equals(obj)) {
                    return new wl(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_pin_login is invalid. Received: ", obj));
            case 309:
                if ("layout/fragment_pin_retry_withdrawal_0".equals(obj)) {
                    return new zl(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_pin_retry_withdrawal is invalid. Received: ", obj));
            case 310:
                if ("layout/fragment_pin_updated_0".equals(obj)) {
                    return new bm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_pin_updated is invalid. Received: ", obj));
            case 311:
                if ("layout/fragment_portfolio_0".equals(obj)) {
                    return new dm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio is invalid. Received: ", obj));
            case 312:
                if ("layout/fragment_portfolio_fno_history_0".equals(obj)) {
                    return new fm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_fno_history is invalid. Received: ", obj));
            case 313:
                if ("layout/fragment_portfolio_fno_orders_0".equals(obj)) {
                    return new hm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_fno_orders is invalid. Received: ", obj));
            case 314:
                if ("layout/fragment_portfolio_stock_history_0".equals(obj)) {
                    Object[] j11 = m.j(view, 9, null, jm.f5156z);
                    Spinner spinner = (Spinner) j11[3];
                    RecyclerView recyclerView = (RecyclerView) j11[6];
                    TextView textView = (TextView) j11[8];
                    MaterialCardView materialCardView = (MaterialCardView) j11[2];
                    ImageView imageView = (ImageView) j11[5];
                    ?? imVar = new im(null, view, spinner, recyclerView, textView, materialCardView, imageView, (SwipeRefreshLayout) j11[0]);
                    imVar.f5157y = -1L;
                    imVar.f5064x.setTag(null);
                    view.setTag(R.id.dataBinding, imVar);
                    imVar.h();
                    return imVar;
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_stock_history is invalid. Received: ", obj));
            case 315:
                if ("layout/fragment_portfolio_stock_holding_0".equals(obj)) {
                    return new lm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_stock_holding is invalid. Received: ", obj));
            case 316:
                if ("layout/fragment_portfolio_stock_order_0".equals(obj)) {
                    Object[] j12 = m.j(view, 10, null, nm.f5586z);
                    Spinner spinner2 = (Spinner) j12[4];
                    TextView textView2 = (TextView) j12[9];
                    RecyclerView recyclerView2 = (RecyclerView) j12[7];
                    MaterialCardView materialCardView2 = (MaterialCardView) j12[2];
                    ImageView imageView2 = (ImageView) j12[6];
                    ?? mmVar = new mm(null, view, spinner2, textView2, recyclerView2, materialCardView2, imageView2, (SwipeRefreshLayout) j12[0]);
                    mmVar.f5587y = -1L;
                    mmVar.f5487x.setTag(null);
                    view.setTag(R.id.dataBinding, mmVar);
                    mmVar.h();
                    return mmVar;
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_stock_order is invalid. Received: ", obj));
            case 317:
                if ("layout/fragment_portfolio_submitted_0".equals(obj)) {
                    return new om(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_portfolio_submitted is invalid. Received: ", obj));
            case 318:
                if ("layout/fragment_profile_timeline_0".equals(obj)) {
                    return new pm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_profile_timeline is invalid. Received: ", obj));
            case 319:
                if ("layout/fragment_re_set_pin_2_0".equals(obj)) {
                    return new rm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_re_set_pin_2 is invalid. Received: ", obj));
            case 320:
                if ("layout/fragment_redeemed_offers_0".equals(obj)) {
                    return new tm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_redeemed_offers is invalid. Received: ", obj));
            case 321:
                if ("layout/fragment_redemption_offers_list_0".equals(obj)) {
                    return new vm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_redemption_offers_list is invalid. Received: ", obj));
            case 322:
                if ("layout/fragment_redemption_status_bottom_sheet_0".equals(obj)) {
                    return new xm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_redemption_status_bottom_sheet is invalid. Received: ", obj));
            case 323:
                if ("layout/fragment_search_contact_v2_0".equals(obj)) {
                    return new zm(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_search_contact_v2 is invalid. Received: ", obj));
            case 324:
                if ("layout/fragment_set_pin_0".equals(obj)) {
                    return new bn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_set_pin is invalid. Received: ", obj));
            case 325:
                if ("layout/fragment_share_your_achievement_dialog_0".equals(obj)) {
                    return new dn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_share_your_achievement_dialog is invalid. Received: ", obj));
            case 326:
                if ("layout/fragment_social_chat_list_0".equals(obj)) {
                    return new fn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_social_chat_list is invalid. Received: ", obj));
            case 327:
                if ("layout/fragment_social_discover_0".equals(obj)) {
                    return new hn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_social_discover is invalid. Received: ", obj));
            case 328:
                if ("layout/fragment_social_home_feed_compose_0".equals(obj)) {
                    return new jn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_social_home_feed_compose is invalid. Received: ", obj));
            case 329:
                if ("layout/fragment_social_host_0".equals(obj)) {
                    return new ln(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_social_host is invalid. Received: ", obj));
            case 330:
                if ("layout/fragment_sort_by_bottom_sheet_dialog_0".equals(obj)) {
                    return new nn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_sort_by_bottom_sheet_dialog is invalid. Received: ", obj));
            case 331:
                if ("layout/fragment_sort_stock_0".equals(obj)) {
                    return new pn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_sort_stock is invalid. Received: ", obj));
            case 332:
                if ("layout/fragment_stock_analysis_0".equals(obj)) {
                    return new rn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_analysis is invalid. Received: ", obj));
            case 333:
                if ("layout/fragment_stock_charts_0".equals(obj)) {
                    Object[] j13 = m.j(view, 34, null, tn.P);
                    TextView textView3 = (TextView) j13[5];
                    TextView textView4 = (TextView) j13[6];
                    TextView textView5 = (TextView) j13[2];
                    TextView textView6 = (TextView) j13[3];
                    TextView textView7 = (TextView) j13[8];
                    TextView textView8 = (TextView) j13[1];
                    LineChart lineChart = (LineChart) j13[13];
                    Group group = (Group) j13[10];
                    ImageView imageView3 = (ImageView) j13[30];
                    TabLayout tabLayout = (TabLayout) j13[31];
                    ConstraintLayout constraintLayout = (ConstraintLayout) j13[11];
                    TextView textView9 = (TextView) j13[12];
                    LineChart lineChart2 = (LineChart) j13[9];
                    ImageView imageView4 = (ImageView) j13[26];
                    TabLayout tabLayout2 = (TabLayout) j13[27];
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j13[7];
                    TextView textView10 = (TextView) j13[4];
                    ImageView imageView5 = (ImageView) j13[16];
                    ?? snVar = new sn(null, view, textView3, textView4, textView5, textView6, textView7, textView8, lineChart, group, imageView3, tabLayout, constraintLayout, textView9, lineChart2, imageView4, tabLayout2, constraintLayout2, textView10, imageView5, (DisablePossibleNestedScrollView) j13[14], (SwipeRefreshLayout) j13[0], (NestedScrollWebView) j13[17]);
                    snVar.O = -1L;
                    snVar.f6105s.setTag(null);
                    snVar.f6106t.setTag(null);
                    snVar.f6107u.setTag(null);
                    snVar.f6108v.setTag(null);
                    snVar.f6109w.setTag(null);
                    snVar.f6110x.setTag(null);
                    snVar.f6111y.setTag(null);
                    snVar.f6112z.setTag(null);
                    snVar.C.setTag(null);
                    snVar.D.setTag(null);
                    snVar.E.setTag(null);
                    snVar.H.setTag(null);
                    snVar.I.setTag(null);
                    snVar.L.setTag(null);
                    view.setTag(R.id.dataBinding, snVar);
                    snVar.h();
                    return snVar;
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_charts is invalid. Received: ", obj));
            case 334:
                if ("layout/fragment_stock_cover_order_0".equals(obj)) {
                    return new vn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_cover_order is invalid. Received: ", obj));
            case 335:
                if ("layout/fragment_stock_cover_order_confirmation_0".equals(obj)) {
                    return new xn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_cover_order_confirmation is invalid. Received: ", obj));
            case 336:
                if ("layout/fragment_stock_detail_0".equals(obj)) {
                    return new zn(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_detail is invalid. Received: ", obj));
            case 337:
                if ("layout/fragment_stock_gyan_0".equals(obj)) {
                    return new bo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_gyan is invalid. Received: ", obj));
            case 338:
                if ("layout/fragment_stock_list_0".equals(obj)) {
                    return new Cdo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_list is invalid. Received: ", obj));
            case 339:
                if ("layout/fragment_stock_modify_buy_order_0".equals(obj)) {
                    return new fo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_modify_buy_order is invalid. Received: ", obj));
            case 340:
                if ("layout/fragment_stock_modify_short_sell_order_0".equals(obj)) {
                    return new ho(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_modify_short_sell_order is invalid. Received: ", obj));
            case 341:
                if ("layout/fragment_stock_news_0".equals(obj)) {
                    return new io(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_news is invalid. Received: ", obj));
            case 342:
                if ("layout/fragment_stock_order_0".equals(obj)) {
                    return new ko(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_order is invalid. Received: ", obj));
            case 343:
                if ("layout/fragment_stock_order_confirmation_0".equals(obj)) {
                    return new mo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_order_confirmation is invalid. Received: ", obj));
            case 344:
                if ("layout/fragment_stock_order_pending_0".equals(obj)) {
                    return new oo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_order_pending is invalid. Received: ", obj));
            case 345:
                if ("layout/fragment_stock_overview_v2_0".equals(obj)) {
                    Object[] j14 = m.j(view, 5, null, qo.f5883y);
                    ProgressBar progressBar = (ProgressBar) j14[1];
                    RecyclerView recyclerView3 = (RecyclerView) j14[4];
                    TextView textView11 = (TextView) j14[3];
                    ?? poVar = new po(null, view, progressBar, recyclerView3, textView11, (SwipeRefreshLayout) j14[0]);
                    poVar.f5884x = -1L;
                    poVar.f5792s.setTag(null);
                    poVar.f5795v.setTag(null);
                    view.setTag(R.id.dataBinding, poVar);
                    poVar.h();
                    return poVar;
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_overview_v2 is invalid. Received: ", obj));
            case 346:
                if ("layout/fragment_stock_payment_success_0".equals(obj)) {
                    return new so(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_payment_success is invalid. Received: ", obj));
            case 347:
                if ("layout/fragment_stock_sell_0".equals(obj)) {
                    return new uo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_sell is invalid. Received: ", obj));
            case 348:
                if ("layout/fragment_stock_sell_order_confirmation_0".equals(obj)) {
                    return new wo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_sell_order_confirmation is invalid. Received: ", obj));
            case 349:
                if ("layout/fragment_stock_short_sell_confirmation_0".equals(obj)) {
                    return new yo(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_short_sell_confirmation is invalid. Received: ", obj));
            case 350:
                if ("layout/fragment_stock_short_sell_order_0".equals(obj)) {
                    return new ap(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stock_short_sell_order is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [m4.m, ba.xr, java.lang.Object, ba.wr] */
    /* JADX WARN: Type inference failed for: r0v104, types: [m4.m, ba.zr, ba.yr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [m4.m, java.lang.Object, ba.es, ba.fs] */
    /* JADX WARN: Type inference failed for: r0v119, types: [m4.m, ba.is, ba.js, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [m4.m, ba.iq, ba.jq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [ba.kq, m4.m, ba.lq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [m4.m, ba.hr, ba.ir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [m4.m, ba.vr, java.lang.Object, ba.ur] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ba.pr, ba.qr, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [m4.m, ba.jr, ba.kr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [m4.m, ba.gs, java.lang.Object, ba.hs] */
    /* JADX WARN: Type inference failed for: r9v1, types: [m4.m, java.lang.Object, ba.dr, ba.er] */
    /* JADX WARN: Type inference failed for: r9v2, types: [m4.m, ba.fr, java.lang.Object, ba.gr] */
    public static m j(View view, int i10, Object obj) {
        switch (i10) {
            case 351:
                if ("layout/fragment_stocks_list_0".equals(obj)) {
                    return new bp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_stocks_list is invalid. Received: ", obj));
            case 352:
                if ("layout/fragment_subscription_downgrade_prompt_0".equals(obj)) {
                    return new dp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_subscription_downgrade_prompt is invalid. Received: ", obj));
            case 353:
                if ("layout/fragment_subscription_maintenance_0".equals(obj)) {
                    return new fp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_subscription_maintenance is invalid. Received: ", obj));
            case 354:
                if ("layout/fragment_subscription_plan_confirmation_0".equals(obj)) {
                    return new hp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_subscription_plan_confirmation is invalid. Received: ", obj));
            case 355:
                if ("layout/fragment_subscription_purchase_non_success_0".equals(obj)) {
                    return new jp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_subscription_purchase_non_success is invalid. Received: ", obj));
            case 356:
                if ("layout/fragment_subscription_purchase_status_0".equals(obj)) {
                    return new lp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_subscription_purchase_status is invalid. Received: ", obj));
            case 357:
                if ("layout/fragment_unfollow_bottom_sheet_0".equals(obj)) {
                    return new np(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_unfollow_bottom_sheet is invalid. Received: ", obj));
            case 358:
                if ("layout/fragment_unlock_portfolio_details_0".equals(obj)) {
                    return new pp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_unlock_portfolio_details is invalid. Received: ", obj));
            case 359:
                if ("layout/fragment_unlock_portfolio_list_0".equals(obj)) {
                    return new rp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_unlock_portfolio_list is invalid. Received: ", obj));
            case 360:
                if ("layout/fragment_user_blocked_0".equals(obj)) {
                    return new tp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_user_blocked is invalid. Received: ", obj));
            case 361:
                if ("layout/fragment_user_portfolio_details_0".equals(obj)) {
                    return new vp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_user_portfolio_details is invalid. Received: ", obj));
            case 362:
                if ("layout/fragment_user_stats_0".equals(obj)) {
                    return new xp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_user_stats is invalid. Received: ", obj));
            case 363:
                if ("layout/fragment_video_tutorial_0".equals(obj)) {
                    return new zp(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_video_tutorial is invalid. Received: ", obj));
            case 364:
                if ("layout/fragment_wallet_transaction_detail_0".equals(obj)) {
                    return new bq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_wallet_transaction_detail is invalid. Received: ", obj));
            case 365:
                if ("layout/fragment_wallet_transaction_list_0".equals(obj)) {
                    return new dq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for fragment_wallet_transaction_list is invalid. Received: ", obj));
            case 366:
                if ("layout/home_coverflow_section_0".equals(obj)) {
                    return new fq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for home_coverflow_section is invalid. Received: ", obj));
            case 367:
                if ("layout/layout_arrow_slider_0".equals(obj)) {
                    return new hq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_arrow_slider is invalid. Received: ", obj));
            case 368:
                if ("layout/layout_chip_group_view_0".equals(obj)) {
                    Object[] j10 = m.j(view, 2, null, jq.f5167w);
                    ?? iqVar = new iq(null, view, (ChipGroup) j10[1], (ConstraintLayout) j10[0]);
                    iqVar.f5168v = -1L;
                    iqVar.f5075t.setTag(null);
                    view.setTag(R.id.dataBinding, iqVar);
                    iqVar.h();
                    return iqVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_chip_group_view is invalid. Received: ", obj));
            case 369:
                if ("layout/layout_chip_view_0".equals(obj)) {
                    Object[] j11 = m.j(view, 2, null, lq.f5383w);
                    ?? kqVar = new kq(null, view, (LinearLayout) j11[0], (TextView) j11[1]);
                    kqVar.f5384v = -1L;
                    kqVar.f5286s.setTag(null);
                    view.setTag(R.id.dataBinding, kqVar);
                    kqVar.h();
                    return kqVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_chip_view is invalid. Received: ", obj));
            case 370:
                if ("layout/layout_compose_view_0".equals(obj)) {
                    return new nq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_compose_view is invalid. Received: ", obj));
            case 371:
                if ("layout/layout_content_mission_detail_0".equals(obj)) {
                    return new pq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_content_mission_detail is invalid. Received: ", obj));
            case 372:
                if ("layout/layout_content_mission_task_completed_0".equals(obj)) {
                    return new rq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_content_mission_task_completed is invalid. Received: ", obj));
            case 373:
                if ("layout/layout_country_select_bottom_sheet_fragment_0".equals(obj)) {
                    return new tq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_country_select_bottom_sheet_fragment is invalid. Received: ", obj));
            case 374:
                if ("layout/layout_create_account_footer_0".equals(obj)) {
                    return new vq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_create_account_footer is invalid. Received: ", obj));
            case 375:
                if ("layout/layout_crown_image_view_0".equals(obj)) {
                    return new xq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_crown_image_view is invalid. Received: ", obj));
            case 376:
                if ("layout/layout_custom_dialog_multiple_choice_0".equals(obj)) {
                    return new zq(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_custom_dialog_multiple_choice is invalid. Received: ", obj));
            case 377:
                if ("layout/layout_custom_dialog_single_choice_0".equals(obj)) {
                    return new br(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_custom_dialog_single_choice is invalid. Received: ", obj));
            case 378:
                if ("layout/layout_custom_player_control_0".equals(obj)) {
                    return new cr(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_custom_player_control is invalid. Received: ", obj));
            case 379:
                if ("layout/layout_display_view_0".equals(obj)) {
                    Object[] j12 = m.j(view, 3, null, er.f4640x);
                    ?? drVar = new dr(null, view, (LinearLayout) j12[0], (TextView) j12[1], (TextView) j12[2]);
                    drVar.f4641w = -1L;
                    drVar.f4514s.setTag(null);
                    view.setTag(R.id.dataBinding, drVar);
                    drVar.h();
                    return drVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_display_view is invalid. Received: ", obj));
            case 380:
                if ("layout/layout_display_view_v2_0".equals(obj)) {
                    Object[] j13 = m.j(view, 3, null, gr.f4856x);
                    ?? frVar = new fr(null, view, (LinearLayout) j13[0], (TextView) j13[1], (TextView) j13[2]);
                    frVar.f4857w = -1L;
                    frVar.f4737s.setTag(null);
                    view.setTag(R.id.dataBinding, frVar);
                    frVar.h();
                    return frVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_display_view_v2 is invalid. Received: ", obj));
            case 381:
                if ("layout/layout_fno_returns_container_0".equals(obj)) {
                    Object[] j14 = m.j(view, 9, null, ir.f5076u);
                    CardView cardView = (CardView) j14[0];
                    ?? hrVar = new hr(null, view, cardView);
                    hrVar.f5077t = -1L;
                    hrVar.f4969s.setTag(null);
                    view.setTag(R.id.dataBinding, hrVar);
                    hrVar.h();
                    return hrVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_fno_returns_container is invalid. Received: ", obj));
            case 382:
                if ("layout/layout_group_chat_messages_0".equals(obj)) {
                    Object[] j15 = m.j(view, 17, kr.F, kr.G);
                    ImageButton imageButton = (ImageButton) j15[16];
                    ComposeView composeView = (ComposeView) j15[9];
                    TextView textView = (TextView) j15[14];
                    LinearLayout linearLayout = (LinearLayout) j15[1];
                    RelativeLayout relativeLayout = (RelativeLayout) j15[0];
                    LinearLayout linearLayout2 = (LinearLayout) j15[3];
                    ev evVar = (ev) j15[2];
                    ConstraintLayout constraintLayout = (ConstraintLayout) j15[4];
                    RelativeLayout relativeLayout2 = (RelativeLayout) j15[12];
                    RecyclerView recyclerView = (RecyclerView) j15[15];
                    ComposeView composeView2 = (ComposeView) j15[11];
                    RecyclerView recyclerView2 = (RecyclerView) j15[10];
                    ?? jrVar = new jr(null, view, imageButton, composeView, textView, linearLayout, relativeLayout, linearLayout2, evVar, constraintLayout, relativeLayout2, recyclerView, composeView2, recyclerView2);
                    jrVar.E = -1L;
                    jrVar.f5172v.setTag(null);
                    jrVar.f5173w.setTag(null);
                    ev evVar2 = jrVar.f5175y;
                    if (evVar2 != null) {
                        evVar2.f27496j = jrVar;
                    }
                    view.setTag(R.id.dataBinding, jrVar);
                    jrVar.h();
                    return jrVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_group_chat_messages is invalid. Received: ", obj));
            case 383:
                if ("layout/layout_group_info_league_0".equals(obj)) {
                    return new mr(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_group_info_league is invalid. Received: ", obj));
            case 384:
                if ("layout/layout_group_tags_view_0".equals(obj)) {
                    return new or(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_group_tags_view is invalid. Received: ", obj));
            case 385:
                if ("layout/layout_horizontal_discover_category_0".equals(obj)) {
                    Object[] j16 = m.j(view, 3, null, qr.f5893w);
                    ?? prVar = new pr(view, (LinearLayout) j16[0], (TextView) j16[1], (RecyclerView) j16[2], null);
                    prVar.f5894v = -1L;
                    prVar.f5800t.setTag(null);
                    view.setTag(R.id.dataBinding, prVar);
                    prVar.h();
                    return prVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_horizontal_discover_category is invalid. Received: ", obj));
            case 386:
                if ("layout/layout_image_title_three_block_0".equals(obj)) {
                    return new rr(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_image_title_three_block is invalid. Received: ", obj));
            case 387:
                if ("layout/layout_input_view_0".equals(obj)) {
                    return new tr(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_input_view is invalid. Received: ", obj));
            case 388:
                if ("layout/layout_league_portfolio_container_0".equals(obj)) {
                    Object[] j17 = m.j(view, 22, vr.O, vr.P);
                    TextView textView2 = (TextView) j17[19];
                    LinearLayout linearLayout3 = (LinearLayout) j17[10];
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) j17[1];
                    ?? urVar = new ur(null, view, textView2, linearLayout3, linearLayoutCompat, (MaterialButton) j17[6], (wr) j17[2], (TextView) j17[9], (TextView) j17[18], (LinearLayout) j17[7], (LinearLayout) j17[0], (MaterialCardView) j17[3], (RecyclerView) j17[21], (TextView) j17[5], (RelativeLayout) j17[4], (CardView) j17[11], (RecyclerView) j17[20], (TextView) j17[13], (TextView) j17[12], (TextView) j17[17], (TextView) j17[16], (TextView) j17[15], (TextView) j17[14]);
                    urVar.N = -1L;
                    urVar.f6349u.setTag(null);
                    wr wrVar = urVar.f6351w;
                    if (wrVar != null) {
                        wrVar.f27496j = urVar;
                    }
                    urVar.A.setTag(null);
                    view.setTag(R.id.dataBinding, urVar);
                    urVar.h();
                    return urVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_league_portfolio_container is invalid. Received: ", obj));
            case 389:
                if ("layout/layout_league_portfolio_snapshot_0".equals(obj)) {
                    Object[] j18 = m.j(view, 17, null, xr.K);
                    ?? wrVar2 = new wr(null, view, (TextView) j18[4], (RelativeLayout) j18[2], (View) j18[5], (TextView) j18[3], (TextView) j18[11], (ImageView) j18[12], (TextView) j18[7], (TextView) j18[6], (CardView) j18[0], (LinearLayout) j18[10], (TextView) j18[1], (TextView) j18[9], (TextView) j18[8], (TextView) j18[16], (RelativeLayout) j18[14], (View) j18[13], (TextView) j18[15]);
                    wrVar2.J = -1L;
                    wrVar2.A.setTag(null);
                    view.setTag(R.id.dataBinding, wrVar2);
                    wrVar2.h();
                    return wrVar2;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_league_portfolio_snapshot is invalid. Received: ", obj));
            case 390:
                if ("layout/layout_league_winner_0".equals(obj)) {
                    Object[] j19 = m.j(view, 20, null, zr.M);
                    TextView textView3 = (TextView) j19[13];
                    ImageView imageView = (ImageView) j19[10];
                    LinearLayout linearLayout4 = (LinearLayout) j19[8];
                    TextView textView4 = (TextView) j19[11];
                    ImageView imageView2 = (ImageView) j19[9];
                    ImageView imageView3 = (ImageView) j19[12];
                    ?? yrVar = new yr(null, view, textView3, imageView, linearLayout4, textView4, imageView2, imageView3, (RelativeLayout) j19[0], (TextView) j19[7], (ImageView) j19[4], (LinearLayout) j19[2], (TextView) j19[5], (ImageView) j19[3], (ImageView) j19[6], (TextView) j19[19], (ImageView) j19[16], (LinearLayout) j19[14], (TextView) j19[17], (ImageView) j19[15], (ImageView) j19[18]);
                    yrVar.L = -1L;
                    yrVar.f6776y.setTag(null);
                    view.setTag(R.id.dataBinding, yrVar);
                    yrVar.h();
                    return yrVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_league_winner is invalid. Received: ", obj));
            case 391:
                if ("layout/layout_leagues_joined_0".equals(obj)) {
                    return new bs(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_leagues_joined is invalid. Received: ", obj));
            case 392:
                if ("layout/layout_login_account_footer_0".equals(obj)) {
                    return new ds(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_login_account_footer is invalid. Received: ", obj));
            case 393:
                if ("layout/layout_maintenance_v2_0".equals(obj)) {
                    Object[] j20 = m.j(view, 4, null, fs.f4740v);
                    ?? esVar = new es(null, view, (TextView) j20[2], (ConstraintLayout) j20[0]);
                    esVar.f4741u = -1L;
                    esVar.f4643t.setTag(null);
                    view.setTag(R.id.dataBinding, esVar);
                    esVar.h();
                    return esVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_maintenance_v2 is invalid. Received: ", obj));
            case 394:
                if ("layout/layout_market_asset_toolbar_view_0".equals(obj)) {
                    Object[] j21 = m.j(view, 6, null, hs.A);
                    ?? gsVar = new gs(null, view, (TextView) j21[5], (StockChangeInfoBoldView) j21[4], (ImageView) j21[1], (TextView) j21[2], (TextView) j21[3], (ConstraintLayout) j21[0]);
                    gsVar.f4970z = -1L;
                    gsVar.f4864x.setTag(null);
                    view.setTag(R.id.dataBinding, gsVar);
                    gsVar.h();
                    return gsVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_market_asset_toolbar_view is invalid. Received: ", obj));
            case 395:
                if ("layout/layout_market_search_results_0".equals(obj)) {
                    Object[] j22 = m.j(view, 22, null, js.O);
                    LinearLayout linearLayout5 = (LinearLayout) j22[7];
                    TextView textView5 = (TextView) j22[3];
                    TextView textView6 = (TextView) j22[5];
                    TextView textView7 = (TextView) j22[4];
                    TextView textView8 = (TextView) j22[9];
                    TextView textView9 = (TextView) j22[16];
                    TextView textView10 = (TextView) j22[14];
                    LinearLayout linearLayout6 = (LinearLayout) j22[13];
                    LinearLayout linearLayout7 = (LinearLayout) j22[20];
                    ?? isVar = new is(null, view, linearLayout5, textView5, textView6, textView7, textView8, textView9, textView10, linearLayout6, linearLayout7, (LinearLayout) j22[1], (LinearLayout) j22[8], (LinearLayout) j22[10], (RecyclerView) j22[11], (LinearLayout) j22[15], (LinearLayout) j22[17], (RecyclerView) j22[18], (TouchDetectableScrollView) j22[0], (MaterialCardView) j22[6], (TextView) j22[21], (TextView) j22[12], (TextView) j22[19]);
                    isVar.N = -1L;
                    isVar.I.setTag(null);
                    view.setTag(R.id.dataBinding, isVar);
                    isVar.h();
                    return isVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_market_search_results is invalid. Received: ", obj));
            case 396:
                if ("layout/layout_market_slider_0".equals(obj)) {
                    return new ks(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_market_slider is invalid. Received: ", obj));
            case 397:
                if ("layout/layout_mission_detail_cta_0".equals(obj)) {
                    return new ms(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_detail_cta is invalid. Received: ", obj));
            case 398:
                if ("layout/layout_mission_earnings_0".equals(obj)) {
                    return new os(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_earnings is invalid. Received: ", obj));
            case 399:
                if ("layout/layout_mission_history_completed_0".equals(obj)) {
                    return new qs(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_history_completed is invalid. Received: ", obj));
            case 400:
                if ("layout/layout_mission_history_failed_0".equals(obj)) {
                    return new ss(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_history_failed is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [m4.m, java.lang.Object, ba.hv, ba.gv] */
    /* JADX WARN: Type inference failed for: r0v122, types: [ba.pv, m4.m, java.lang.Object, ba.s1] */
    /* JADX WARN: Type inference failed for: r0v126, types: [ba.sv, m4.m, java.lang.Object, ba.aa] */
    /* JADX WARN: Type inference failed for: r0v33, types: [ba.pt, m4.m, ba.ot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ba.rt, ba.qt, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ba.st, m4.m, java.lang.Object, ba.yd] */
    /* JADX WARN: Type inference failed for: r0v39, types: [m4.m, java.lang.Object, ba.tt, ba.ut] */
    /* JADX WARN: Type inference failed for: r0v41, types: [m4.m, java.lang.Object, ba.vt, ba.wt] */
    /* JADX WARN: Type inference failed for: r0v65, types: [m4.m, ba.iu, java.lang.Object, ba.hu] */
    /* JADX WARN: Type inference failed for: r10v19, types: [ba.tv, ba.uv, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [ba.tu, m4.m, java.lang.Object, ba.uu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ba.bt, ba.ct, m4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [m4.m, ba.t9, ba.zv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [ba.aw, m4.m, ba.bw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [m4.m, java.lang.Object, ba.dt, ba.et] */
    /* JADX WARN: Type inference failed for: r7v12, types: [m4.m, java.lang.Object, ba.wu, ba.vu] */
    /* JADX WARN: Type inference failed for: r7v14, types: [m4.m, ba.yu, java.lang.Object, ba.xu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [m4.m, ba.xt, java.lang.Object, ba.yt] */
    /* JADX WARN: Type inference failed for: r7v20, types: [m4.m, java.lang.Object, ba.xv, ba.yv] */
    /* JADX WARN: Type inference failed for: r7v21, types: [m4.m, java.lang.Object, ba.iw, ba.hw] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ba.au, m4.m, ba.zt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ba.ou, m4.m, ba.nu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [ba.su, ba.ru, m4.m, java.lang.Object] */
    public static m k(View view, int i10, Object obj) {
        switch (i10) {
            case TokenInvalidationInterceptor.InvalidatedTokenResponseCode /* 401 */:
                if ("layout/layout_mission_history_under_review_0".equals(obj)) {
                    return new us(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_history_under_review is invalid. Received: ", obj));
            case 402:
                if ("layout/layout_mission_how_to_play_0".equals(obj)) {
                    return new ws(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_how_to_play is invalid. Received: ", obj));
            case 403:
                if ("layout/layout_mission_input_view_0".equals(obj)) {
                    return new ys(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_input_view is invalid. Received: ", obj));
            case 404:
                if ("layout/layout_mission_input_view_widget_0".equals(obj)) {
                    return new at(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_input_view_widget is invalid. Received: ", obj));
            case 405:
                if ("layout/layout_mission_progress_bar_0".equals(obj)) {
                    Object[] j10 = m.j(view, 3, null, ct.f4415x);
                    ?? btVar = new bt(null, view, (CircularProgressIndicator) j10[1], (ConstraintLayout) j10[0], (TextView) j10[2]);
                    btVar.f4416w = -1L;
                    btVar.f4318t.setTag(null);
                    view.setTag(R.id.dataBinding, btVar);
                    btVar.h();
                    return btVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_progress_bar is invalid. Received: ", obj));
            case 406:
                if ("layout/layout_mission_time_status_chip_0".equals(obj)) {
                    Object[] j11 = m.j(view, 4, null, et.f4644y);
                    ?? dtVar = new dt(null, view, (MaterialCardView) j11[0], (ConstraintLayout) j11[2], (TextView) j11[1], (LottieAnimationView) j11[3]);
                    dtVar.f4645x = -1L;
                    dtVar.f4519s.setTag(null);
                    dtVar.f4521u.setTag(null);
                    view.setTag(R.id.dataBinding, dtVar);
                    dtVar.h();
                    return dtVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_time_status_chip is invalid. Received: ", obj));
            case 407:
                if ("layout/layout_mission_your_reward_chip_0".equals(obj)) {
                    return new gt(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_mission_your_reward_chip is invalid. Received: ", obj));
            case 408:
                if ("layout/layout_missions_card_header_banner_0".equals(obj)) {
                    return new jt(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_missions_card_header_banner is invalid. Received: ", obj));
            case 409:
                if ("layout/layout_missions_home_user_info_0".equals(obj)) {
                    return new lt(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_missions_home_user_info is invalid. Received: ", obj));
            case 410:
                if ("layout/layout_navigation_drawer_0".equals(obj)) {
                    return new nt(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_navigation_drawer is invalid. Received: ", obj));
            case 411:
                if ("layout/layout_no_internet_connection_0".equals(obj)) {
                    Object[] j12 = m.j(view, 5, null, pt.f5804u);
                    ConstraintLayout constraintLayout = (ConstraintLayout) j12[0];
                    ?? otVar = new ot(null, view, constraintLayout);
                    otVar.f5805t = -1L;
                    otVar.f5694s.setTag(null);
                    view.setTag(R.id.dataBinding, otVar);
                    otVar.h();
                    return otVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_no_internet_connection is invalid. Received: ", obj));
            case 412:
                if ("layout/layout_payment_error_child_view_0".equals(obj)) {
                    Object[] j13 = m.j(view, 3, null, rt.f6005w);
                    CardView cardView = (CardView) j13[0];
                    ?? qtVar = new qt(view, (TextView) j13[1], cardView, null);
                    qtVar.f6006v = -1L;
                    qtVar.f5897s.setTag(null);
                    qtVar.f5898t.setTag(null);
                    view.setTag(R.id.dataBinding, qtVar);
                    qtVar.h();
                    return qtVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_payment_error_child_view is invalid. Received: ", obj));
            case 413:
                if ("layout/layout_periodic_gain_0".equals(obj)) {
                    ?? ydVar = new yd(null, view, (LinearLayout) m.j(view, 1, null, null)[0]);
                    ydVar.f6128t = -1L;
                    ydVar.f6717s.setTag(null);
                    view.setTag(R.id.dataBinding, ydVar);
                    ydVar.h();
                    return ydVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_periodic_gain is invalid. Received: ", obj));
            case 414:
                if ("layout/layout_popup_no_internet_connection_0".equals(obj)) {
                    Object[] j14 = m.j(view, 2, null, ut.f6357u);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j14[0];
                    ?? ttVar = new tt(null, view, constraintLayout2);
                    ttVar.f6358t = -1L;
                    ttVar.f6226s.setTag(null);
                    view.setTag(R.id.dataBinding, ttVar);
                    ttVar.h();
                    return ttVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_popup_no_internet_connection is invalid. Received: ", obj));
            case 415:
                if ("layout/layout_portfolio_balance_0".equals(obj)) {
                    Object[] j15 = m.j(view, 4, null, wt.f6583w);
                    CardView cardView2 = (CardView) j15[0];
                    TextView textView = (TextView) j15[3];
                    ?? vtVar = new vt(null, view, cardView2, textView);
                    vtVar.f6584v = -1L;
                    vtVar.f6470s.setTag(null);
                    view.setTag(R.id.dataBinding, vtVar);
                    vtVar.h();
                    return vtVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_balance is invalid. Received: ", obj));
            case 416:
                if ("layout/layout_portfolio_data_league_0".equals(obj)) {
                    Object[] j16 = m.j(view, 5, null, yt.f6780y);
                    TextView textView2 = (TextView) j16[2];
                    TextView textView3 = (TextView) j16[1];
                    TextView textView4 = (TextView) j16[4];
                    CardView cardView3 = (CardView) j16[0];
                    ?? xtVar = new xt(null, view, textView2, textView3, textView4, cardView3);
                    xtVar.f6781x = -1L;
                    xtVar.f6684v.setTag(null);
                    view.setTag(R.id.dataBinding, xtVar);
                    xtVar.h();
                    return xtVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_data_league is invalid. Received: ", obj));
            case 417:
                if ("layout/layout_portfolio_fno_value_0".equals(obj)) {
                    Object[] j17 = m.j(view, 11, null, au.A);
                    TextView textView5 = (TextView) j17[9];
                    ImageView imageView = (ImageView) j17[10];
                    TextView textView6 = (TextView) j17[5];
                    TextView textView7 = (TextView) j17[2];
                    CardView cardView4 = (CardView) j17[0];
                    TextView textView8 = (TextView) j17[8];
                    ?? ztVar = new zt(null, view, textView5, imageView, textView6, textView7, cardView4, textView8);
                    ztVar.f4231z = -1L;
                    ztVar.f6888w.setTag(null);
                    view.setTag(R.id.dataBinding, ztVar);
                    ztVar.h();
                    return ztVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_fno_value is invalid. Received: ", obj));
            case 418:
                if ("layout/layout_portfolio_history_details_0".equals(obj)) {
                    return new cu(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_history_details is invalid. Received: ", obj));
            case 419:
                if ("layout/layout_portfolio_holdings_stocks_0".equals(obj)) {
                    return new eu(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_holdings_stocks is invalid. Received: ", obj));
            case 420:
                if ("layout/layout_portfolio_order_details_0".equals(obj)) {
                    return new gu(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_order_details is invalid. Received: ", obj));
            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                if ("layout/layout_portfolio_returns_0".equals(obj)) {
                    Object[] j18 = m.j(view, 2, null, iu.f5086v);
                    ?? huVar = new hu(null, view, (LinearLayout) j18[0], (LinearLayout) j18[1]);
                    huVar.f5087u = -1L;
                    huVar.f4979s.setTag(null);
                    view.setTag(R.id.dataBinding, huVar);
                    huVar.h();
                    return huVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_returns is invalid. Received: ", obj));
            case 422:
                if ("layout/layout_portfolio_value_0".equals(obj)) {
                    return new ku(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_value is invalid. Received: ", obj));
            case 423:
                if ("layout/layout_portfolio_value_details_0".equals(obj)) {
                    return new mu(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_portfolio_value_details is invalid. Received: ", obj));
            case 424:
                if ("layout/layout_prep_zone_header_0".equals(obj)) {
                    Object[] j19 = m.j(view, 4, null, ou.f5695y);
                    ?? nuVar = new nu(null, view, (ChipView) j19[3], (ImageView) j19[1], (TextView) j19[2], (ConstraintLayout) j19[0]);
                    nuVar.f5696x = -1L;
                    nuVar.f5615v.setTag(null);
                    view.setTag(R.id.dataBinding, nuVar);
                    nuVar.h();
                    return nuVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_prep_zone_header is invalid. Received: ", obj));
            case 425:
                if ("layout/layout_prepzone_whats_new_0".equals(obj)) {
                    return new qu(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_prepzone_whats_new is invalid. Received: ", obj));
            case 426:
                if ("layout/layout_price_input_view_0".equals(obj)) {
                    Object[] j20 = m.j(view, 8, null, su.B);
                    ?? ruVar = new ru(null, view, (RelativeLayout) j20[2], (TextView) j20[7], (View) j20[6], (EditText) j20[4], (TextView) j20[1], (ConstraintLayout) j20[0], (TextView) j20[5]);
                    ruVar.A = -1L;
                    ruVar.f6013x.setTag(null);
                    view.setTag(R.id.dataBinding, ruVar);
                    ruVar.h();
                    return ruVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_price_input_view is invalid. Received: ", obj));
            case 427:
                if ("layout/layout_profile_social_auth_0".equals(obj)) {
                    Object[] j21 = m.j(view, 17, null, uu.G);
                    RelativeLayout relativeLayout = (RelativeLayout) j21[1];
                    InputView inputView = (InputView) j21[5];
                    InputView inputView2 = (InputView) j21[7];
                    RelativeLayout relativeLayout2 = (RelativeLayout) j21[2];
                    ChipView chipView = (ChipView) j21[4];
                    MaterialButton materialButton = (MaterialButton) j21[8];
                    MaterialButton materialButton2 = (MaterialButton) j21[16];
                    RelativeLayout relativeLayout3 = (RelativeLayout) j21[9];
                    InputView inputView3 = (InputView) j21[13];
                    InputView inputView4 = (InputView) j21[15];
                    RelativeLayout relativeLayout4 = (RelativeLayout) j21[10];
                    ?? tuVar = new tu(null, view, relativeLayout, inputView, inputView2, relativeLayout2, chipView, materialButton, materialButton2, relativeLayout3, inputView3, inputView4, relativeLayout4, (ChipView) j21[12], (ConstraintLayout) j21[0]);
                    tuVar.F = -1L;
                    tuVar.E.setTag(null);
                    view.setTag(R.id.dataBinding, tuVar);
                    tuVar.h();
                    return tuVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_profile_social_auth is invalid. Received: ", obj));
            case 428:
                if ("layout/layout_profit_container_0".equals(obj)) {
                    Object[] j22 = m.j(view, 10, null, wu.D);
                    CardView cardView5 = (CardView) j22[0];
                    TextView textView9 = (TextView) j22[8];
                    TextView textView10 = (TextView) j22[9];
                    ?? vuVar = new vu(null, view, cardView5, textView9, textView10, (TextView) j22[3], (TextView) j22[2], (TextView) j22[7], (TextView) j22[6], (TextView) j22[5], (TextView) j22[4]);
                    vuVar.C = -1L;
                    vuVar.f6472s.setTag(null);
                    view.setTag(R.id.dataBinding, vuVar);
                    vuVar.h();
                    return vuVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_profit_container is invalid. Received: ", obj));
            case 429:
                if ("layout/layout_proof_upload_view_0".equals(obj)) {
                    Object[] j23 = m.j(view, 4, null, yu.f6782x);
                    ?? xuVar = new xu(null, view, (TextView) j23[3], (LinearLayout) j23[2], (LinearLayout) j23[1], (LinearLayout) j23[0]);
                    xuVar.f6783w = -1L;
                    xuVar.f6688v.setTag(null);
                    view.setTag(R.id.dataBinding, xuVar);
                    xuVar.h();
                    return xuVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_proof_upload_view is invalid. Received: ", obj));
            case 430:
                if ("layout/layout_search_contact_0".equals(obj)) {
                    return new av(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_search_contact is invalid. Received: ", obj));
            case 431:
                if ("layout/layout_search_stocks_0".equals(obj)) {
                    return new cv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_search_stocks is invalid. Received: ", obj));
            case 432:
                if ("layout/layout_social_input_view_0".equals(obj)) {
                    return new dv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_social_input_view is invalid. Received: ", obj));
            case 433:
                if ("layout/layout_social_message_input_with_cta_0".equals(obj)) {
                    return new fv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_social_message_input_with_cta is invalid. Received: ", obj));
            case 434:
                if ("layout/layout_social_search_results_0".equals(obj)) {
                    Object[] j24 = m.j(view, 18, null, hv.J);
                    TextView textView11 = (TextView) j24[2];
                    TextView textView12 = (TextView) j24[4];
                    TextView textView13 = (TextView) j24[3];
                    TextView textView14 = (TextView) j24[6];
                    TextView textView15 = (TextView) j24[12];
                    LinearLayout linearLayout = (LinearLayout) j24[9];
                    LinearLayout linearLayout2 = (LinearLayout) j24[16];
                    ?? gvVar = new gv(null, view, textView11, textView12, textView13, textView14, textView15, linearLayout, linearLayout2, (LinearLayout) j24[5], (RecyclerView) j24[7], (LinearLayout) j24[11], (LinearLayout) j24[13], (RecyclerView) j24[14], (TouchDetectableScrollView) j24[0], (TextView) j24[17], (TextView) j24[8], (TextView) j24[15]);
                    gvVar.I = -1L;
                    gvVar.E.setTag(null);
                    view.setTag(R.id.dataBinding, gvVar);
                    gvVar.h();
                    return gvVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_social_search_results is invalid. Received: ", obj));
            case 435:
                if ("layout/layout_stock_change_info_0".equals(obj)) {
                    return new jv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_change_info is invalid. Received: ", obj));
            case 436:
                if ("layout/layout_stock_change_info_bold_0".equals(obj)) {
                    return new lv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_change_info_bold is invalid. Received: ", obj));
            case 437:
                if ("layout/layout_stock_fundamentals_0".equals(obj)) {
                    return new mv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_fundamentals is invalid. Received: ", obj));
            case 438:
                if ("layout/layout_stock_holdings_pie_chart_view_0".equals(obj)) {
                    return new ov(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_holdings_pie_chart_view is invalid. Received: ", obj));
            case 439:
                if ("layout/layout_stock_mentionable_edit_text_0".equals(obj)) {
                    ?? s1Var = new s1(view, (StockTagEditText) m.j(view, 1, null, null)[0], null);
                    s1Var.f5810t = -1L;
                    ((StockTagEditText) s1Var.f6033s).setTag(null);
                    view.setTag(R.id.dataBinding, s1Var);
                    s1Var.h();
                    return s1Var;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_mentionable_edit_text is invalid. Received: ", obj));
            case 440:
                if ("layout/layout_stock_specs_0".equals(obj)) {
                    return new rv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_stock_specs is invalid. Received: ", obj));
            case 441:
                if ("layout/layout_subscription_plan_filter_0".equals(obj)) {
                    Object[] j25 = m.j(view, 5, null, sv.f6129u);
                    ?? aaVar = new aa((Object) null, view, (LinearLayout) j25[0]);
                    aaVar.f6130t = -1L;
                    ((LinearLayout) aaVar.f4179s).setTag(null);
                    view.setTag(R.id.dataBinding, aaVar);
                    aaVar.h();
                    return aaVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_subscription_plan_filter is invalid. Received: ", obj));
            case 442:
                if ("layout/layout_timer_container_0".equals(obj)) {
                    Object[] j26 = m.j(view, 5, null, uv.f6359y);
                    ?? tvVar = new tv(null, view, (TextView) j26[4], (LinearLayout) j26[2], (RelativeLayout) j26[0], (ImageView) j26[3], (TextView) j26[1]);
                    tvVar.f6360x = -1L;
                    tvVar.f6237u.setTag(null);
                    view.setTag(R.id.dataBinding, tvVar);
                    tvVar.h();
                    return tvVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_timer_container is invalid. Received: ", obj));
            case 443:
                if ("layout/layout_tnc_registration_0".equals(obj)) {
                    return new wv(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_tnc_registration is invalid. Received: ", obj));
            case 444:
                if ("layout/layout_transfer_pending_0".equals(obj)) {
                    Object[] j27 = m.j(view, 5, null, yv.f6784x);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) j27[0];
                    MaterialButton materialButton3 = (MaterialButton) j27[4];
                    ?? xvVar = new xv(null, view, constraintLayout3, materialButton3, (TextView) j27[3], (TextView) j27[1]);
                    xvVar.f6785w = -1L;
                    xvVar.f6689s.setTag(null);
                    view.setTag(R.id.dataBinding, xvVar);
                    xvVar.h();
                    return xvVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_transfer_pending is invalid. Received: ", obj));
            case 445:
                if ("layout/layout_upcoming_league_sort_0".equals(obj)) {
                    Object[] j28 = m.j(view, 3, null, zv.f6892w);
                    ?? t9Var = new t9(view, (ImageView) j28[1], (TextView) j28[2], (CardView) j28[0], (Object) null);
                    t9Var.f6893v = -1L;
                    ((CardView) t9Var.f6172u).setTag(null);
                    view.setTag(R.id.dataBinding, t9Var);
                    t9Var.h();
                    return t9Var;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_upcoming_league_sort is invalid. Received: ", obj));
            case 446:
                if ("layout/layout_vertical_discover_category_0".equals(obj)) {
                    Object[] j29 = m.j(view, 3, null, bw.f4324w);
                    ?? awVar = new aw(view, (LinearLayout) j29[0], (TextView) j29[1], (RecyclerView) j29[2], null);
                    awVar.f4325v = -1L;
                    awVar.f4234s.setTag(null);
                    view.setTag(R.id.dataBinding, awVar);
                    awVar.h();
                    return awVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_vertical_discover_category is invalid. Received: ", obj));
            case 447:
                if ("layout/layout_video_player_0".equals(obj)) {
                    return new dw(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_video_player is invalid. Received: ", obj));
            case 448:
                if ("layout/layout_video_settings_dialog_0".equals(obj)) {
                    return new ew(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_video_settings_dialog is invalid. Received: ", obj));
            case 449:
                if ("layout/layout_wallet_bifurcation_0".equals(obj)) {
                    return new gw(view);
                }
                throw new IllegalArgumentException(h.q("The tag for layout_wallet_bifurcation is invalid. Received: ", obj));
            case 450:
                if ("layout/layout_withdrawal_bank_0".equals(obj)) {
                    Object[] j30 = m.j(view, 4, null, iw.f5093x);
                    ?? hwVar = new hw(null, view, (CardView) j30[0], (InputView) j30[2], (InputView) j30[1], (InputView) j30[3]);
                    hwVar.f5094w = -1L;
                    hwVar.f4981s.setTag(null);
                    view.setTag(R.id.dataBinding, hwVar);
                    hwVar.h();
                    return hwVar;
                }
                throw new IllegalArgumentException(h.q("The tag for layout_withdrawal_bank is invalid. Received: ", obj));
            default:
                return null;
        }
    }

    @Override // m4.c
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [ba.ph, ba.oh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v197, types: [ba.ow, ba.nw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v246, types: [java.lang.Object, ba.hx, ba.ix] */
    /* JADX WARN: Type inference failed for: r0v253, types: [ba.lx, java.lang.Object, ba.mx] */
    /* JADX WARN: Type inference failed for: r0v257, types: [ba.t9, ba.nx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v267, types: [ba.sx, ba.mf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ba.wh, m4.m, java.lang.Object, ba.xh] */
    /* JADX WARN: Type inference failed for: r0v283, types: [ba.cy, java.lang.Object, ba.yd] */
    /* JADX WARN: Type inference failed for: r0v287, types: [ba.dy, java.lang.Object, ba.yd] */
    /* JADX WARN: Type inference failed for: r0v292, types: [ba.ey, java.lang.Object, ba.yd] */
    /* JADX WARN: Type inference failed for: r0v82, types: [ba.fj, ba.ej, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [ba.o7, java.lang.Object, ba.oj] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ba.vw, m4.m, java.lang.Object, ba.ww] */
    /* JADX WARN: Type inference failed for: r3v54, types: [m4.m, ba.ax, java.lang.Object, ba.zw] */
    /* JADX WARN: Type inference failed for: r6v1, types: [m4.m, ba.rj, ba.sj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ba.kw, java.lang.Object, ba.jw] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ba.mw, java.lang.Object, ba.lw] */
    @Override // m4.c
    public final m b(View view, int i10) {
        m mVar;
        m mVar2;
        m mVar3;
        int i11 = f8558a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch ((i11 - 1) / 50) {
                    case 0:
                        return d(view, i11, tag);
                    case 1:
                        return e(view, i11, tag);
                    case 2:
                        return f(view, i11, tag);
                    case 3:
                        return g(view, i11, tag);
                    case 4:
                        return h(view, i11, tag);
                    case 5:
                        switch (i11) {
                            case 251:
                                if ("layout/fragment_fno_option_detail_0".equals(tag)) {
                                    return new nh(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_fno_option_detail is invalid. Received: ", tag));
                            case 252:
                                if ("layout/fragment_fno_portfolio_holdings_0".equals(tag)) {
                                    ?? ohVar = new oh(null, view, (ComposeView) m.j(view, 1, null, null)[0]);
                                    ohVar.f5768t = -1L;
                                    ohVar.f5666s.setTag(null);
                                    view.setTag(R.id.dataBinding, ohVar);
                                    ohVar.h();
                                    mVar = ohVar;
                                    break;
                                } else {
                                    throw new IllegalArgumentException(h.q("The tag for fragment_fno_portfolio_holdings is invalid. Received: ", tag));
                                }
                            case 253:
                                if ("layout/fragment_group_description_edit_0".equals(tag)) {
                                    return new rh(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_group_description_edit is invalid. Received: ", tag));
                            case 254:
                                if ("layout/fragment_group_feed_and_chat_host_0".equals(tag)) {
                                    return new th(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_group_feed_and_chat_host is invalid. Received: ", tag));
                            case 255:
                                if ("layout/fragment_group_info_v2_0".equals(tag)) {
                                    return new vh(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_group_info_v2 is invalid. Received: ", tag));
                            case 256:
                                if ("layout/fragment_group_messages_0".equals(tag)) {
                                    Object[] j10 = m.j(view, 2, xh.f6656v, null);
                                    ?? whVar = new wh(null, view, (FrameLayout) j10[0], (jr) j10[1]);
                                    whVar.f6657u = -1L;
                                    whVar.f6532s.setTag(null);
                                    jr jrVar = whVar.f6533t;
                                    if (jrVar != null) {
                                        jrVar.f27496j = whVar;
                                    }
                                    view.setTag(R.id.dataBinding, whVar);
                                    whVar.h();
                                    mVar = whVar;
                                    break;
                                } else {
                                    throw new IllegalArgumentException(h.q("The tag for fragment_group_messages is invalid. Received: ", tag));
                                }
                            case 257:
                                if ("layout/fragment_group_name_edit_0".equals(tag)) {
                                    return new zh(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_group_name_edit is invalid. Received: ", tag));
                            case 258:
                                if ("layout/fragment_home_0".equals(tag)) {
                                    return new bi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_home is invalid. Received: ", tag));
                            case 259:
                                if ("layout/fragment_info_bottom_sheet_fragment_0".equals(tag)) {
                                    return new di(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_info_bottom_sheet_fragment is invalid. Received: ", tag));
                            case 260:
                                if ("layout/fragment_intro_0".equals(tag)) {
                                    return new fi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_intro is invalid. Received: ", tag));
                            case 261:
                                if ("layout/fragment_intro_template_0".equals(tag)) {
                                    return new hi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_intro_template is invalid. Received: ", tag));
                            case 262:
                                if ("layout/fragment_kyc_completed_0".equals(tag)) {
                                    return new ji(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_completed is invalid. Received: ", tag));
                            case 263:
                                if ("layout/fragment_kyc_faq_0".equals(tag)) {
                                    return new li(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_faq is invalid. Received: ", tag));
                            case 264:
                                if ("layout/fragment_kyc_maintenance_0".equals(tag)) {
                                    return new ni(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_maintenance is invalid. Received: ", tag));
                            case 265:
                                if ("layout/fragment_kyc_permission_0".equals(tag)) {
                                    return new pi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_permission is invalid. Received: ", tag));
                            case 266:
                                if ("layout/fragment_kyc_query_submitted_0".equals(tag)) {
                                    return new ri(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_query_submitted is invalid. Received: ", tag));
                            case 267:
                                if ("layout/fragment_kyc_steps_0".equals(tag)) {
                                    return new ti(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_steps is invalid. Received: ", tag));
                            case 268:
                                if ("layout/fragment_kyc_tutorial_card_0".equals(tag)) {
                                    return new vi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_tutorial_card is invalid. Received: ", tag));
                            case 269:
                                if ("layout/fragment_kyc_verification_pending_0".equals(tag)) {
                                    return new xi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_verification_pending is invalid. Received: ", tag));
                            case 270:
                                if ("layout/fragment_kyc_verification_rejected_0".equals(tag)) {
                                    return new zi(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_kyc_verification_rejected is invalid. Received: ", tag));
                            case 271:
                                if ("layout/fragment_leaderboard_0".equals(tag)) {
                                    return new aj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_leaderboard is invalid. Received: ", tag));
                            case 272:
                                if ("layout/fragment_league_copy_portfolio_0".equals(tag)) {
                                    return new bj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_league_copy_portfolio is invalid. Received: ", tag));
                            case 273:
                                if ("layout/fragment_league_detail_payment_bottom_sheet_0".equals(tag)) {
                                    return new dj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_league_detail_payment_bottom_sheet is invalid. Received: ", tag));
                            case 274:
                                if ("layout/fragment_league_join_0".equals(tag)) {
                                    Object[] j11 = m.j(view, 12, null, fj.f4714u);
                                    RelativeLayout relativeLayout = (RelativeLayout) j11[0];
                                    ?? ejVar = new ej(null, view, relativeLayout);
                                    ejVar.f4715t = -1L;
                                    ejVar.f4623s.setTag(null);
                                    view.setTag(R.id.dataBinding, ejVar);
                                    ejVar.h();
                                    mVar = ejVar;
                                    break;
                                } else {
                                    throw new IllegalArgumentException(h.q("The tag for fragment_league_join is invalid. Received: ", tag));
                                }
                            case 275:
                                if ("layout/fragment_league_statistics_0".equals(tag)) {
                                    return new hj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_league_statistics is invalid. Received: ", tag));
                            case 276:
                                if ("layout/fragment_leagues_leader_board_0".equals(tag)) {
                                    return new jj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_leagues_leader_board is invalid. Received: ", tag));
                            case 277:
                                if ("layout/fragment_leagues_porfolio_0".equals(tag)) {
                                    return new lj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_leagues_porfolio is invalid. Received: ", tag));
                            case 278:
                                if ("layout/fragment_maintenance_v2_0".equals(tag)) {
                                    return new nj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_maintenance_v2 is invalid. Received: ", tag));
                            case 279:
                                if ("layout/fragment_maintenance_window_0".equals(tag)) {
                                    Object[] j12 = m.j(view, 6, null, oj.f5668u);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) j12[0];
                                    ?? o7Var = new o7((Object) null, view, constraintLayout);
                                    o7Var.f5669t = -1L;
                                    ((ConstraintLayout) o7Var.f5648s).setTag(null);
                                    view.setTag(R.id.dataBinding, o7Var);
                                    o7Var.h();
                                    mVar = o7Var;
                                    break;
                                } else {
                                    throw new IllegalArgumentException(h.q("The tag for fragment_maintenance_window is invalid. Received: ", tag));
                                }
                            case 280:
                                if ("layout/fragment_market_asset_host_0".equals(tag)) {
                                    return new qj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_asset_host is invalid. Received: ", tag));
                            case 281:
                                if ("layout/fragment_market_asset_insights_0".equals(tag)) {
                                    Object[] j13 = m.j(view, 5, null, sj.f6093w);
                                    ComposeView composeView = (ComposeView) j13[3];
                                    RecyclerView recyclerView = (RecyclerView) j13[4];
                                    ?? rjVar = new rj(null, view, composeView, recyclerView, (SwipeRefreshLayout) j13[0]);
                                    rjVar.f6094v = -1L;
                                    rjVar.f5976u.setTag(null);
                                    view.setTag(R.id.dataBinding, rjVar);
                                    rjVar.h();
                                    return rjVar;
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_asset_insights is invalid. Received: ", tag));
                            case 282:
                                if ("layout/fragment_market_insights_detail_0".equals(tag)) {
                                    return new uj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_insights_detail is invalid. Received: ", tag));
                            case 283:
                                if ("layout/fragment_market_option_host_0".equals(tag)) {
                                    return new wj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_option_host is invalid. Received: ", tag));
                            case 284:
                                if ("layout/fragment_market_options_list_0".equals(tag)) {
                                    return new yj(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_options_list is invalid. Received: ", tag));
                            case 285:
                                if ("layout/fragment_market_search_options_list_0".equals(tag)) {
                                    return new ak(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_search_options_list is invalid. Received: ", tag));
                            case 286:
                                if ("layout/fragment_market_stocks_host_0".equals(tag)) {
                                    return new ck(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_stocks_host is invalid. Received: ", tag));
                            case 287:
                                if ("layout/fragment_market_stocks_list_0".equals(tag)) {
                                    return new ek(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_market_stocks_list is invalid. Received: ", tag));
                            case 288:
                                if ("layout/fragment_member_options_bottom_sheet_0".equals(tag)) {
                                    return new gk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_member_options_bottom_sheet is invalid. Received: ", tag));
                            case 289:
                                if ("layout/fragment_mission_history_0".equals(tag)) {
                                    return new ik(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_mission_history is invalid. Received: ", tag));
                            case 290:
                                if ("layout/fragment_mission_task_detail_0".equals(tag)) {
                                    return new kk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_mission_task_detail is invalid. Received: ", tag));
                            case 291:
                                if ("layout/fragment_missions_home_0".equals(tag)) {
                                    return new mk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_missions_home is invalid. Received: ", tag));
                            case 292:
                                if ("layout/fragment_missions_status_detail_0".equals(tag)) {
                                    return new ok(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_missions_status_detail is invalid. Received: ", tag));
                            case 293:
                                if ("layout-h640dp/fragment_mobile_login_0".equals(tag)) {
                                    return new qk(view);
                                }
                                if ("layout/fragment_mobile_login_0".equals(tag)) {
                                    return new rk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_mobile_login is invalid. Received: ", tag));
                            case 294:
                                if ("layout/fragment_mobile_register_0".equals(tag)) {
                                    return new uk(view);
                                }
                                if ("layout-h640dp/fragment_mobile_register_0".equals(tag)) {
                                    return new tk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_mobile_register is invalid. Received: ", tag));
                            case 295:
                                if ("layout/fragment_modify_order_confirmation_0".equals(tag)) {
                                    return new wk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_modify_order_confirmation is invalid. Received: ", tag));
                            case 296:
                                if ("layout/fragment_modify_short_sell_order_confirmation_0".equals(tag)) {
                                    return new yk(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_modify_short_sell_order_confirmation is invalid. Received: ", tag));
                            case 297:
                                if ("layout/fragment_modify_stock_cover_order_0".equals(tag)) {
                                    return new al(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_modify_stock_cover_order is invalid. Received: ", tag));
                            case 298:
                                if ("layout/fragment_modify_stock_cover_order_confirmation_0".equals(tag)) {
                                    return new cl(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_modify_stock_cover_order_confirmation is invalid. Received: ", tag));
                            case 299:
                                if ("layout/fragment_my_profile_group_0".equals(tag)) {
                                    return new el(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_my_profile_group is invalid. Received: ", tag));
                            case 300:
                                if ("layout/fragment_my_subscription_0".equals(tag)) {
                                    return new gl(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for fragment_my_subscription is invalid. Received: ", tag));
                            default:
                                return null;
                        }
                        return mVar;
                    case 6:
                        return i(view, i11, tag);
                    case 7:
                        return j(view, i11, tag);
                    case 8:
                        return k(view, i11, tag);
                    case 9:
                        switch (i11) {
                            case 451:
                                if ("layout/layout_withdrawal_paytm_wallet_0".equals(tag)) {
                                    Object[] j14 = m.j(view, 3, null, kw.f5301w);
                                    ?? jwVar = new jw(null, view, (CardView) j14[0], (InputView) j14[1], (InputView) j14[2]);
                                    jwVar.f5302v = -1L;
                                    jwVar.f5182s.setTag(null);
                                    view.setTag(R.id.dataBinding, jwVar);
                                    jwVar.h();
                                    mVar2 = jwVar;
                                    return mVar2;
                                }
                                throw new IllegalArgumentException(h.q("The tag for layout_withdrawal_paytm_wallet is invalid. Received: ", tag));
                            case 452:
                                if ("layout/layout_withdrawal_upi_0".equals(tag)) {
                                    Object[] j15 = m.j(view, 3, null, mw.f5504w);
                                    ?? lwVar = new lw(null, view, (CardView) j15[0], (InputView) j15[1], (InputView) j15[2]);
                                    lwVar.f5505v = -1L;
                                    lwVar.f5405s.setTag(null);
                                    view.setTag(R.id.dataBinding, lwVar);
                                    lwVar.h();
                                    mVar2 = lwVar;
                                    return mVar2;
                                }
                                throw new IllegalArgumentException(h.q("The tag for layout_withdrawal_upi is invalid. Received: ", tag));
                            case 453:
                                if ("layout/list_item_chat_message_footer_0".equals(tag)) {
                                    Object[] j16 = m.j(view, 3, null, ow.f5699u);
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j16[0];
                                    ?? nwVar = new nw(null, view, constraintLayout2);
                                    nwVar.f5700t = -1L;
                                    nwVar.f5619s.setTag(null);
                                    view.setTag(R.id.dataBinding, nwVar);
                                    nwVar.h();
                                    mVar3 = nwVar;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_message_footer is invalid. Received: ", tag));
                            case 454:
                                if ("layout/list_item_chat_message_interaction_layout_0".equals(tag)) {
                                    return new qw(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_message_interaction_layout is invalid. Received: ", tag));
                            case 455:
                                if ("layout/list_item_chat_message_me_0".equals(tag)) {
                                    return new sw(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_message_me is invalid. Received: ", tag));
                            case 456:
                                if ("layout/list_item_chat_message_other_0".equals(tag)) {
                                    return new uw(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_message_other is invalid. Received: ", tag));
                            case 457:
                                if ("layout/list_item_chat_message_reported_0".equals(tag)) {
                                    Object[] j17 = m.j(view, 7, null, ww.f6587x);
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) j17[0];
                                    TextView textView = (TextView) j17[1];
                                    ?? vwVar = new vw(null, view, constraintLayout3, textView, (TextView) j17[2]);
                                    vwVar.f6588w = -1L;
                                    vwVar.f6484s.setTag(null);
                                    vwVar.f6485t.setTag(null);
                                    vwVar.f6486u.setTag(null);
                                    view.setTag(R.id.dataBinding, vwVar);
                                    vwVar.h();
                                    return vwVar;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_message_reported is invalid. Received: ", tag));
                            case 458:
                                if ("layout/list_item_chat_reported_message_me_0".equals(tag)) {
                                    return new yw(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_reported_message_me is invalid. Received: ", tag));
                            case 459:
                                if ("layout/list_item_chat_reported_message_other_0".equals(tag)) {
                                    Object[] j18 = m.j(view, 10, ax.C, ax.D);
                                    ImageView imageView = (ImageView) j18[5];
                                    ImageView imageView2 = (ImageView) j18[7];
                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) j18[1];
                                    bx bxVar = (bx) j18[2];
                                    RelativeLayout relativeLayout2 = (RelativeLayout) j18[4];
                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) j18[0];
                                    vw vwVar2 = (vw) j18[3];
                                    ?? zwVar = new zw(null, view, imageView, imageView2, constraintLayout4, bxVar, relativeLayout2, constraintLayout5, vwVar2);
                                    zwVar.B = -1L;
                                    zwVar.f6896u.setTag(null);
                                    bx bxVar2 = zwVar.f6897v;
                                    if (bxVar2 != null) {
                                        bxVar2.f27496j = zwVar;
                                    }
                                    zwVar.f6899x.setTag(null);
                                    vw vwVar3 = zwVar.f6900y;
                                    if (vwVar3 != null) {
                                        vwVar3.f27496j = zwVar;
                                    }
                                    view.setTag(R.id.dataBinding, zwVar);
                                    zwVar.h();
                                    return zwVar;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_chat_reported_message_other is invalid. Received: ", tag));
                            case 460:
                                if ("layout/list_item_group_chat_date_layout_0".equals(tag)) {
                                    return new cx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_group_chat_date_layout is invalid. Received: ", tag));
                            case 461:
                                if ("layout/list_item_group_chat_thread_user_me_0".equals(tag)) {
                                    return new ex(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_group_chat_thread_user_me is invalid. Received: ", tag));
                            case 462:
                                if ("layout/list_item_group_chat_thread_user_other_0".equals(tag)) {
                                    return new gx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_group_chat_thread_user_other is invalid. Received: ", tag));
                            case 463:
                                if ("layout/list_item_message_document_layout_0".equals(tag)) {
                                    Object[] j19 = m.j(view, 4, null, ix.f5095u);
                                    MaterialCardView materialCardView = (MaterialCardView) j19[0];
                                    ?? hxVar = new hx(null, view, materialCardView);
                                    hxVar.f5096t = -1L;
                                    hxVar.f4985s.setTag(null);
                                    view.setTag(R.id.dataBinding, hxVar);
                                    hxVar.h();
                                    mVar3 = hxVar;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_message_document_layout is invalid. Received: ", tag));
                            case 464:
                                if ("layout/list_item_message_image_layout_0".equals(tag)) {
                                    return new kx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_message_image_layout is invalid. Received: ", tag));
                            case 465:
                                if ("layout/list_item_message_text_layout_0".equals(tag)) {
                                    Object[] j20 = m.j(view, 4, null, mx.f5506u);
                                    LinearLayout linearLayout = (LinearLayout) j20[0];
                                    ?? lxVar = new lx(null, view, linearLayout);
                                    lxVar.f5507t = -1L;
                                    lxVar.f5408s.setTag(null);
                                    view.setTag(R.id.dataBinding, lxVar);
                                    lxVar.h();
                                    mVar3 = lxVar;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_message_text_layout is invalid. Received: ", tag));
                            case 466:
                                if ("layout/list_item_parent_message_text_layout_0".equals(tag)) {
                                    Object[] j21 = m.j(view, 2, null, null);
                                    ?? t9Var = new t9(null, view, (LinearLayout) j21[0], (TextView) j21[1]);
                                    t9Var.f5620v = -1L;
                                    ((LinearLayout) t9Var.f6171t).setTag(null);
                                    ((TextView) t9Var.f6170s).setTag(null);
                                    view.setTag(R.id.dataBinding, t9Var);
                                    t9Var.h();
                                    mVar3 = t9Var;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_parent_message_text_layout is invalid. Received: ", tag));
                            case 467:
                                if ("layout/list_item_thread_detail_info_reply_0".equals(tag)) {
                                    return new px(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for list_item_thread_detail_info_reply is invalid. Received: ", tag));
                            case 468:
                                if ("layout/multiple_country_input_view_0".equals(tag)) {
                                    return new rx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for multiple_country_input_view is invalid. Received: ", tag));
                            case 469:
                                if ("layout/social_merge_button_layout_0".equals(tag)) {
                                    Object[] j22 = m.j(view, 7, null, sx.f6131u);
                                    RelativeLayout relativeLayout3 = (RelativeLayout) j22[0];
                                    ?? mfVar = new mf(null, view, relativeLayout3);
                                    mfVar.f6132t = -1L;
                                    ((RelativeLayout) mfVar.f5467s).setTag(null);
                                    view.setTag(R.id.dataBinding, mfVar);
                                    mfVar.h();
                                    mVar3 = mfVar;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for social_merge_button_layout is invalid. Received: ", tag));
                            case 470:
                                if ("layout/sticker_item_layout_0".equals(tag)) {
                                    return new ux(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for sticker_item_layout is invalid. Received: ", tag));
                            case 471:
                                if ("layout/stockgro_list_item_chat_parent_layout_0".equals(tag)) {
                                    return new wx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for stockgro_list_item_chat_parent_layout is invalid. Received: ", tag));
                            case 472:
                                if ("layout/understaring_option_bottom_sheet_0".equals(tag)) {
                                    return new yx(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for understaring_option_bottom_sheet is invalid. Received: ", tag));
                            case 473:
                                if ("layout/view_allow_contact_access_0".equals(tag)) {
                                    return new ay(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for view_allow_contact_access is invalid. Received: ", tag));
                            case 474:
                                if ("layout/view_no_channels_0".equals(tag)) {
                                    Object[] j23 = m.j(view, 2, null, cy.f4426u);
                                    ?? ydVar = new yd(null, view, (LinearLayout) j23[0]);
                                    ydVar.f4427t = -1L;
                                    ydVar.f6717s.setTag(null);
                                    view.setTag(R.id.dataBinding, ydVar);
                                    ydVar.h();
                                    mVar3 = ydVar;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for view_no_channels is invalid. Received: ", tag));
                            case 475:
                                if ("layout/view_no_contact_search_results_0".equals(tag)) {
                                    Object[] j24 = m.j(view, 2, null, dy.f4544u);
                                    ?? ydVar2 = new yd(null, view, (LinearLayout) j24[0]);
                                    ydVar2.f4545t = -1L;
                                    ydVar2.f6717s.setTag(null);
                                    view.setTag(R.id.dataBinding, ydVar2);
                                    ydVar2.h();
                                    mVar3 = ydVar2;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for view_no_contact_search_results is invalid. Received: ", tag));
                            case 476:
                                if ("layout/view_no_results_0".equals(tag)) {
                                    ?? ydVar3 = new yd(null, view, (LinearLayout) m.j(view, 1, null, null)[0]);
                                    ydVar3.f4652t = -1L;
                                    ydVar3.f6717s.setTag(null);
                                    view.setTag(R.id.dataBinding, ydVar3);
                                    ydVar3.h();
                                    mVar3 = ydVar3;
                                    return mVar3;
                                }
                                throw new IllegalArgumentException(h.q("The tag for view_no_results is invalid. Received: ", tag));
                            case 477:
                                if ("layout/widget_expert_trade_view_0".equals(tag)) {
                                    return new gy(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for widget_expert_trade_view is invalid. Received: ", tag));
                            case 478:
                                if ("layout/widget_ria_basic_info_0".equals(tag)) {
                                    return new iy(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for widget_ria_basic_info is invalid. Received: ", tag));
                            case 479:
                                if ("layout/widget_ria_expertise_0".equals(tag)) {
                                    return new ky(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for widget_ria_expertise is invalid. Received: ", tag));
                            case 480:
                                if ("layout/widget_ria_outline_0".equals(tag)) {
                                    return new my(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for widget_ria_outline is invalid. Received: ", tag));
                            case 481:
                                if ("layout/withdrawal_pin_layout_0".equals(tag)) {
                                    return new oy(view);
                                }
                                throw new IllegalArgumentException(h.q("The tag for withdrawal_pin_layout is invalid. Received: ", tag));
                            default:
                                return null;
                        }
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // m4.c
    public final m c(View[] viewArr, int i10) {
        if (viewArr.length == 0 || f8558a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
