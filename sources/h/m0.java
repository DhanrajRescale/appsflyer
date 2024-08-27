package h;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.f2;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.exoplayer.ExoPlaybackException;
import b5.g1;
import b5.i1;
import b5.p1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.assetgro.stockgro.widget.mentionable_edit_text.CustomEditText;
import com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText;
import com.assetgro.stockgro.widget.stock_tag_edit_text.StockMentionableEditText;
import com.assetgro.stockgro.widget.stock_tag_edit_text.StockTagEditText;
import com.facebook.FacebookSdk;
import i5.b1;
import i5.d1;
import i5.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17715c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.f17713a = i10;
        this.f17714b = obj;
        this.f17715c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z5.y tVar;
        boolean z15;
        int i10;
        PopupWindow popupWindow;
        String str;
        Set set;
        Set set2;
        Set set3;
        Date date;
        Set set4;
        Set set5;
        Date date2;
        long j11 = -9223372036854775807L;
        switch (this.f17713a) {
            case 0:
                n0 n0Var = (n0) this.f17714b;
                Runnable runnable = (Runnable) this.f17715c;
                n0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    n0Var.a();
                }
            case 1:
                i1.a.a((i1.c) this.f17714b, (LongSparseArray) this.f17715c);
                return;
            case 2:
                ((t3.b) this.f17714b).f((Typeface) this.f17715c);
                return;
            case 3:
            case 5:
            case 14:
            default:
                yk.b accessTokenAppIdPair = (yk.b) this.f17714b;
                yk.e appEvent = (yk.e) this.f17715c;
                ek.u uVar = yk.i.f41694a;
                if (!sl.a.b(yk.i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
                        ek.u uVar2 = yk.i.f41694a;
                        synchronized (uVar2) {
                            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                            yk.u x10 = uVar2.x(accessTokenAppIdPair);
                            if (x10 != null) {
                                x10.a(appEvent);
                            }
                        }
                        ek.h hVar = yk.l.f41701b;
                        if (yk.m.f41703c.r() != yk.k.f41699b && yk.i.f41694a.p() > 100) {
                            yk.i.d(yk.p.f41716c);
                            return;
                        } else {
                            if (yk.i.f41696c == null) {
                                yk.i.f41696c = yk.i.f41695b.schedule(yk.i.f41697d, 15L, TimeUnit.SECONDS);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        sl.a.a(yk.i.class, th2);
                        return;
                    }
                }
                return;
            case 4:
                androidx.fragment.app.k transitionInfo = (androidx.fragment.app.k) this.f17714b;
                f2 operation = (f2) this.f17715c;
                Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                transitionInfo.a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                    return;
                }
                return;
            case 6:
                String str2 = (String) this.f17714b;
                Violation violation = (Violation) this.f17715c;
                u4.b bVar = u4.c.f36741a;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str2, violation);
                throw violation;
            case 7:
                ((v5.f) this.f17715c).a(((e5.o) this.f17714b).d());
                return;
            case 8:
                i5.g0 g0Var = (i5.g0) this.f17714b;
                i5.j0 j0Var = (i5.j0) this.f17715c;
                int i11 = g0Var.G - j0Var.f19519c;
                g0Var.G = i11;
                if (j0Var.f19520d) {
                    g0Var.H = j0Var.f19521e;
                    z10 = true;
                    g0Var.I = true;
                } else {
                    z10 = true;
                }
                if (j0Var.f19522f) {
                    g0Var.J = j0Var.f19523g;
                }
                if (i11 == 0) {
                    i1 i1Var = j0Var.f19518b.f19362a;
                    if (!g0Var.f19459g0.f19362a.q() && i1Var.q()) {
                        g0Var.f19461h0 = -1;
                        g0Var.f19463i0 = 0L;
                    }
                    if (!i1Var.q()) {
                        List asList = Arrays.asList(((f1) i1Var).f19431h);
                        if (asList.size() == g0Var.f19469o.size()) {
                            z14 = z10;
                        } else {
                            z14 = false;
                        }
                        yk.j.H0(z14);
                        for (int i12 = 0; i12 < asList.size(); i12++) {
                            ((i5.f0) g0Var.f19469o.get(i12)).f19423b = (i1) asList.get(i12);
                        }
                    }
                    if (g0Var.I) {
                        if (j0Var.f19518b.f19363b.equals(g0Var.f19459g0.f19363b) && j0Var.f19518b.f19365d == g0Var.f19459g0.f19379r) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if (z13) {
                            if (!i1Var.q() && !j0Var.f19518b.f19363b.a()) {
                                b1 b1Var = j0Var.f19518b;
                                r5.w wVar = b1Var.f19363b;
                                long j12 = b1Var.f19365d;
                                Object obj = wVar.f3556a;
                                g1 g1Var = g0Var.f19468n;
                                i1Var.h(obj, g1Var);
                                j11 = j12 + g1Var.f3320e;
                            } else {
                                j11 = j0Var.f19518b.f19365d;
                            }
                        }
                        j10 = j11;
                        z12 = z13;
                        z11 = false;
                    } else {
                        j10 = -9223372036854775807L;
                        z11 = false;
                        z12 = false;
                    }
                    g0Var.I = z11;
                    g0Var.V(j0Var.f19518b, 1, g0Var.J, z12, g0Var.H, j10, -1, false);
                    return;
                }
                return;
            case 9:
                i5.m0 m0Var = (i5.m0) this.f17714b;
                d1 d1Var = (d1) this.f17715c;
                m0Var.getClass();
                try {
                    synchronized (d1Var) {
                    }
                    try {
                        d1Var.f19385a.c(d1Var.f19388d, d1Var.f19389e);
                        d1Var.b(true);
                        return;
                    } catch (Throwable th3) {
                        d1Var.b(true);
                        throw th3;
                    }
                } catch (ExoPlaybackException e10) {
                    e5.m.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 10:
                tr.e eVar = (tr.e) this.f17714b;
                final String str3 = (String) this.f17715c;
                i5.d0 d0Var = (i5.d0) eVar.f36362c;
                int i13 = e5.x.f15050a;
                j5.w wVar2 = (j5.w) d0Var.f19384a.f19472r;
                final j5.b U = wVar2.U();
                final int i14 = 0;
                wVar2.V(U, 1012, new e5.j(U, str3, i14) { // from class: j5.r

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20999a;

                    {
                        this.f20999a = i14;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj2) {
                        switch (this.f20999a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            case 11:
                AudioTrack audioTrack = (AudioTrack) this.f17714b;
                r0 r0Var = (r0) this.f17715c;
                Object obj2 = k5.e0.f22055g0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    r0Var.f();
                    synchronized (k5.e0.f22055g0) {
                        try {
                            int i15 = k5.e0.f22057i0 - 1;
                            k5.e0.f22057i0 = i15;
                            if (i15 == 0) {
                                k5.e0.f22056h0.shutdown();
                                k5.e0.f22056h0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    r0Var.f();
                    synchronized (k5.e0.f22055g0) {
                        try {
                            int i16 = k5.e0.f22057i0 - 1;
                            k5.e0.f22057i0 = i16;
                            if (i16 == 0) {
                                k5.e0.f22056h0.shutdown();
                                k5.e0.f22056h0 = null;
                            }
                            throw th4;
                        } finally {
                        }
                    }
                }
            case 12:
                n5.f fVar = (n5.f) this.f17714b;
                b5.v vVar = (b5.v) this.f17715c;
                n5.g gVar = fVar.f28281d;
                if (gVar.f28296p != 0 && !fVar.f28280c) {
                    Looper looper = gVar.f28300t;
                    looper.getClass();
                    fVar.f28279b = gVar.f(looper, fVar.f28278a, vVar, false);
                    gVar.f28294n.add(fVar);
                    return;
                }
                return;
            case 13:
                r5.m0 m0Var2 = (r5.m0) this.f17714b;
                z5.y yVar = (z5.y) this.f17715c;
                if (m0Var2.f33234r == null) {
                    tVar = yVar;
                } else {
                    tVar = new z5.t(-9223372036854775807L);
                }
                m0Var2.f33241y = tVar;
                m0Var2.f33242z = yVar.i();
                if (!m0Var2.F && yVar.i() == -9223372036854775807L) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                m0Var2.A = z15;
                if (z15) {
                    i10 = 7;
                } else {
                    i10 = 1;
                }
                m0Var2.B = i10;
                m0Var2.f33223g.t(yVar.c(), m0Var2.A, m0Var2.f33242z);
                if (!m0Var2.f33238v) {
                    m0Var2.n();
                    return;
                }
                return;
            case 15:
                x5.e eVar2 = (x5.e) this.f17714b;
                Exception exc = (Exception) this.f17715c;
                x5.w wVar3 = (x5.w) eVar2.f39981b;
                int i17 = e5.x.f15050a;
                j5.w wVar4 = (j5.w) ((i5.d0) wVar3).f19384a.f19472r;
                j5.b U2 = wVar4.U();
                wVar4.V(U2, 1030, new j5.q(U2, exc, 1));
                return;
            case 16:
                x5.e eVar3 = (x5.e) this.f17714b;
                p1 p1Var = (p1) this.f17715c;
                x5.w wVar5 = (x5.w) eVar3.f39981b;
                int i18 = e5.x.f15050a;
                i5.g0 g0Var2 = ((i5.d0) wVar5).f19384a;
                g0Var2.f19455e0 = p1Var;
                g0Var2.f19466l.l(25, new b3.t(p1Var, 10));
                return;
            case 17:
                x5.e eVar4 = (x5.e) this.f17714b;
                final String str4 = (String) this.f17715c;
                x5.w wVar6 = (x5.w) eVar4.f39981b;
                int i19 = e5.x.f15050a;
                j5.w wVar7 = (j5.w) ((i5.d0) wVar6).f19384a.f19472r;
                final j5.b U3 = wVar7.U();
                final int i20 = 1;
                wVar7.V(U3, 1019, new e5.j(U3, str4, i20) { // from class: j5.r

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f20999a;

                    {
                        this.f20999a = i20;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj22) {
                        switch (this.f20999a) {
                            case 0:
                                ((c) obj22).getClass();
                                return;
                            default:
                                ((c) obj22).getClass();
                                return;
                        }
                    }
                });
                return;
            case 18:
                y5.k kVar = (y5.k) this.f17714b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f17715c;
                SurfaceTexture surfaceTexture2 = kVar.f41214g;
                Surface surface = kVar.f41215h;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f41214g = surfaceTexture;
                kVar.f41215h = surface2;
                Iterator it = kVar.f41208a.iterator();
                while (it.hasNext()) {
                    ((i5.d0) it.next()).f19384a.R(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 19:
                MarketStocksListViewModel this$0 = (MarketStocksListViewModel) this.f17714b;
                ArrayList tempList = (ArrayList) this.f17715c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(tempList, "$tempList");
                this$0.k(new ta.j(tempList));
                this$0.f9084g.postValue(Boolean.FALSE);
                return;
            case 20:
                GroupChatFragment this$02 = (GroupChatFragment) this.f17714b;
                List message = (List) this.f17715c;
                PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(message, "$messages");
                yd.r rVar = this$02.f9157q;
                if (rVar != null) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    rVar.f41586e.addAll(message);
                    rVar.d();
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 21:
                SplashActivity this$03 = (SplashActivity) this.f17714b;
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f17715c;
                int i21 = SplashActivity.f10156m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.c(installReferrerClient);
                this$03.getClass();
                installReferrerClient.startConnection(new hi.a(installReferrerClient, this$03, 0));
                return;
            case 22:
                String referrerUrl = (String) this.f17714b;
                SplashActivity this$04 = (SplashActivity) this.f17715c;
                int i22 = SplashActivity.f10156m;
                Intrinsics.checkNotNullParameter(referrerUrl, "$referrerUrl");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                aq.j jVar = new aq.j();
                Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
                intent.putExtra("referrer", referrerUrl);
                jVar.onReceive(this$04.getApplicationContext(), intent);
                return;
            case 23:
                MentionableEditText mentionableEditText = (MentionableEditText) this.f17714b;
                ArrayList arrayList = (ArrayList) this.f17715c;
                if (mentionableEditText.f10759h == null) {
                    mentionableEditText.f10757f = ((LayoutInflater) mentionableEditText.getContext().getSystemService("layout_inflater")).inflate(R.layout.layout_content_suggestion_list, (ViewGroup) null);
                    PopupWindow popupWindow3 = new PopupWindow(mentionableEditText.f10757f, -1, -2);
                    mentionableEditText.f10759h = popupWindow3;
                    popupWindow3.setFocusable(false);
                }
                if (arrayList.size() <= 0) {
                    sj.h hVar2 = mentionableEditText.f10755d;
                    ArrayList arrayList2 = hVar2.f34668d;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                        hVar2.d();
                    }
                } else {
                    sj.h hVar3 = mentionableEditText.f10755d;
                    hVar3.f34668d = arrayList;
                    hVar3.d();
                }
                mentionableEditText.f10759h.setContentView(mentionableEditText.f10756e);
                mentionableEditText.f10753b = false;
                int size = arrayList.size();
                if (!mentionableEditText.f10753b) {
                    mentionableEditText.f10759h.dismiss();
                    mentionableEditText.f10757f.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = mentionableEditText.f10757f.getMeasuredHeight() * size;
                    if (size >= 6) {
                        measuredHeight = 450;
                    }
                    if (measuredHeight < 450) {
                        mentionableEditText.f10759h = new PopupWindow(mentionableEditText.f10757f, mentionableEditText.f10754c.getMeasuredWidth(), -2);
                    } else {
                        mentionableEditText.f10759h = new PopupWindow(mentionableEditText.f10757f, mentionableEditText.f10754c.getMeasuredWidth(), 450);
                    }
                    mentionableEditText.f10759h.setBackgroundDrawable(mentionableEditText.getContext().getDrawable(R.drawable.rounded_white_rectangle_radius_4_dp));
                    mentionableEditText.f10759h.setContentView(mentionableEditText.f10756e);
                    mentionableEditText.f10753b = false;
                    PopupWindow popupWindow4 = mentionableEditText.f10759h;
                    CustomEditText customEditText = mentionableEditText.f10754c;
                    popupWindow4.showAsDropDown(customEditText, 0, (-customEditText.getMeasuredHeight()) - measuredHeight);
                    mentionableEditText.f10753b = true;
                    return;
                }
                return;
            case 24:
                StockMentionableEditText this$05 = (StockMentionableEditText) this.f17714b;
                ArrayList suggestionList = (ArrayList) this.f17715c;
                int i23 = StockMentionableEditText.f10762h;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(suggestionList, "$suggestionList");
                if (this$05.f10769g == null) {
                    Object systemService = this$05.getContext().getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    this$05.f10768f = ((LayoutInflater) systemService).inflate(R.layout.layout_content_suggestion_list, (ViewGroup) null);
                    PopupWindow popupWindow5 = new PopupWindow(this$05.f10768f, -1, -2);
                    this$05.f10769g = popupWindow5;
                    popupWindow5.setFocusable(false);
                }
                if (suggestionList.size() <= 0) {
                    uj.b bVar2 = this$05.f10766d;
                    Intrinsics.c(bVar2);
                    ArrayList arrayList3 = bVar2.f37223d;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                        bVar2.d();
                    }
                } else {
                    uj.b bVar3 = this$05.f10766d;
                    Intrinsics.c(bVar3);
                    bVar3.f37223d = suggestionList;
                    uj.b bVar4 = this$05.f10766d;
                    Intrinsics.c(bVar4);
                    bVar4.d();
                }
                PopupWindow popupWindow6 = this$05.f10769g;
                Intrinsics.c(popupWindow6);
                popupWindow6.setContentView(this$05.f10767e);
                this$05.f10764b = false;
                int size2 = suggestionList.size();
                if (!this$05.f10764b) {
                    PopupWindow popupWindow7 = this$05.f10769g;
                    Intrinsics.c(popupWindow7);
                    popupWindow7.dismiss();
                    View view = this$05.f10768f;
                    Intrinsics.c(view);
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    View view2 = this$05.f10768f;
                    Intrinsics.c(view2);
                    int measuredHeight2 = view2.getMeasuredHeight() * size2;
                    if (size2 < 6 && measuredHeight2 < 450) {
                        View view3 = this$05.f10768f;
                        StockTagEditText stockTagEditText = this$05.f10765c;
                        Intrinsics.c(stockTagEditText);
                        popupWindow = new PopupWindow(view3, stockTagEditText.getMeasuredWidth(), -2);
                    } else {
                        View view4 = this$05.f10768f;
                        StockTagEditText stockTagEditText2 = this$05.f10765c;
                        Intrinsics.c(stockTagEditText2);
                        popupWindow = new PopupWindow(view4, stockTagEditText2.getMeasuredWidth(), 450);
                    }
                    this$05.f10769g = popupWindow;
                    popupWindow.setBackgroundDrawable(this$05.getContext().getDrawable(R.drawable.background_stock_suggestion_popup));
                    PopupWindow popupWindow8 = this$05.f10769g;
                    Intrinsics.c(popupWindow8);
                    popupWindow8.setContentView(this$05.f10767e);
                    this$05.f10764b = false;
                    PopupWindow popupWindow9 = this$05.f10769g;
                    Intrinsics.c(popupWindow9);
                    popupWindow9.showAsDropDown(this$05.f10765c, 0, 0);
                    this$05.f10764b = true;
                    return;
                }
                return;
            case 25:
                xk.g this$06 = (xk.g) this.f17714b;
                a3.a.u(this.f17715c);
                ek.h hVar4 = xk.g.f40363f;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.a();
                return;
            case 26:
                FacebookSdk.m11publishInstallAsync$lambda15((Context) this.f17714b, (String) this.f17715c);
                return;
            case 27:
                ArrayList callbacks = (ArrayList) this.f17714b;
                xk.c0 it2 = (xk.c0) this.f17715c;
                Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
                Intrinsics.checkNotNullParameter(it2, "$requests");
                Iterator it3 = callbacks.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    xk.v vVar2 = (xk.v) pair.first;
                    Object obj3 = pair.second;
                    Intrinsics.checkNotNullExpressionValue(obj3, "pair.second");
                    vVar2.onCompleted((xk.d0) obj3);
                }
                Iterator it4 = it2.f40338d.iterator();
                while (it4.hasNext()) {
                    xk.e eVar5 = (xk.e) ((xk.b0) it4.next());
                    xk.a aVar = eVar5.f40347b;
                    xk.f refreshResult = eVar5.f40346a;
                    Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
                    AtomicBoolean permissionsCallSucceeded = eVar5.f40348c;
                    Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
                    Set permissions = eVar5.f40349d;
                    Intrinsics.checkNotNullParameter(permissions, "$permissions");
                    Set declinedPermissions = eVar5.f40350e;
                    Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
                    Set expiredPermissions = eVar5.f40351f;
                    Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
                    xk.g this$07 = eVar5.f40352g;
                    Intrinsics.checkNotNullParameter(this$07, "this$0");
                    Intrinsics.checkNotNullParameter(it2, "it");
                    String str5 = refreshResult.f40356a;
                    int i24 = refreshResult.f40358c;
                    Long l10 = (Long) refreshResult.f40360e;
                    String str6 = refreshResult.f40357b;
                    try {
                        ek.h hVar5 = xk.g.f40363f;
                        if (hVar5.r().f40367c != null) {
                            xk.a aVar2 = hVar5.r().f40367c;
                            if (aVar2 == null) {
                                str = null;
                            } else {
                                str = aVar2.f40320i;
                            }
                            if (str == aVar.f40320i && (permissionsCallSucceeded.get() || str5 != null || i24 != 0)) {
                                Date date3 = aVar.f40312a;
                                if (refreshResult.f40358c != 0) {
                                    set = declinedPermissions;
                                    date = new Date(refreshResult.f40358c * 1000);
                                    set2 = permissions;
                                    set3 = expiredPermissions;
                                } else {
                                    set = declinedPermissions;
                                    if (refreshResult.f40359d != 0) {
                                        set2 = permissions;
                                        set3 = expiredPermissions;
                                        date3 = new Date((refreshResult.f40359d * 1000) + new Date().getTime());
                                    } else {
                                        set2 = permissions;
                                        set3 = expiredPermissions;
                                    }
                                    date = date3;
                                }
                                if (str5 == null) {
                                    str5 = aVar.f40316e;
                                }
                                String str7 = str5;
                                String str8 = aVar.f40319h;
                                String str9 = aVar.f40320i;
                                if (!permissionsCallSucceeded.get()) {
                                    set2 = aVar.f40313b;
                                }
                                Set set6 = set2;
                                if (permissionsCallSucceeded.get()) {
                                    set4 = set;
                                } else {
                                    set4 = aVar.f40314c;
                                }
                                Set set7 = set4;
                                if (permissionsCallSucceeded.get()) {
                                    set5 = set3;
                                } else {
                                    set5 = aVar.f40315d;
                                }
                                Set set8 = set5;
                                xk.h hVar6 = aVar.f40317f;
                                Date date4 = new Date();
                                if (l10 != null) {
                                    date2 = new Date(l10.longValue() * 1000);
                                } else {
                                    date2 = aVar.f40321j;
                                }
                                Date date5 = date2;
                                if (str6 == null) {
                                    str6 = aVar.f40322k;
                                }
                                hVar5.r().c(new xk.a(str7, str8, str9, set6, set7, set8, hVar6, date, date4, date5, str6), true);
                            }
                        }
                        this$07.f40368d.set(false);
                    } catch (Throwable th5) {
                        this$07.f40368d.set(false);
                        throw th5;
                    }
                }
                return;
        }
    }
}
