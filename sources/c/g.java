package c;

import a2.a1;
import a2.z0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.w;
import androidx.fragment.app.j0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.q;
import androidx.navigation.v0;
import b0.c1;
import b0.d1;
import b0.j1;
import b0.k1;
import b0.m1;
import c2.b2;
import c2.c2;
import c2.e1;
import c2.r1;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import com.assetgro.stockgro.ui.social.domain.model.CreatorMeta;
import d0.g0;
import d0.k0;
import d0.u;
import d2.a0;
import i0.b3;
import i0.f2;
import i0.r;
import i0.s2;
import iu.v;
import j2.b0;
import j2.d0;
import j2.e0;
import java.text.BreakIterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kb.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.r0;
import m0.a4;
import m0.p2;
import m0.q2;
import mt.p;
import n1.b1;
import n1.w0;
import p2.c0;
import qu.f0;
import qu.o1;
import r0.x1;
import r0.y1;
import r0.z2;
import t0.g1;
import t0.l3;
import t0.n0;
import t0.o0;
import v.h0;
import v.i0;
import v.z;
import vt.x;
import w.s0;
import y.q1;
import y.s;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f7419a = i10;
        this.f7420b = obj;
        this.f7421c = obj2;
        this.f7422d = obj3;
    }

    public final n0 a(o0 DisposableEffect) {
        int i10 = this.f7419a;
        int i11 = 1;
        Object obj = this.f7422d;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7420b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                i iVar = (i) obj;
                ((w) obj3).a((t) obj2, iVar);
                return new c(iVar, i11);
            case 17:
                c1.a aVar = new c1.a((g1) obj, 0);
                LiveData liveData = (LiveData) obj3;
                liveData.observe((t) obj2, aVar);
                return new s0(7, liveData, aVar);
            default:
                d1.k kVar = (d1.k) obj3;
                if (!kVar.f13277b.containsKey(obj2)) {
                    kVar.f13276a.remove(obj2);
                    d1.i iVar2 = (d1.i) obj;
                    kVar.f13277b.put(obj2, iVar2);
                    return new d1.j(iVar2, kVar, obj2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
    }

    public final void d(float f10) {
        float f11;
        int i10 = this.f7419a;
        Object obj = this.f7422d;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7420b;
        switch (i10) {
            case 3:
                if (((s) obj3).f40924p) {
                    f11 = 1.0f;
                } else {
                    f11 = -1.0f;
                }
                float a10 = ((q1) obj2).a(f11 * f10) * f11;
                if (Math.abs(a10) < Math.abs(f10)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + a10 + " < " + f10 + ')');
                    cancellationException.initCause(null);
                    ((o1) obj).a(cancellationException);
                    return;
                }
                return;
            default:
                z2 z2Var = (z2) obj2;
                yk.g.H((f0) obj3, null, null, new y1(z2Var, f10, null), 3).I(new x1(z2Var, (Function0) obj, 1));
                return;
        }
    }

    public final void e(z0 z0Var) {
        int i10 = this.f7419a;
        Object obj = this.f7422d;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7420b;
        switch (i10) {
            case 4:
                c1 c1Var = (c1) obj3;
                if (c1Var.f2842p) {
                    a2.o0 o0Var = (a2.o0) obj;
                    z0.g(z0Var, (a1) obj2, o0Var.m0(c1Var.f2840n), o0Var.m0(c1Var.f2841o));
                    return;
                }
                a2.o0 o0Var2 = (a2.o0) obj;
                int m02 = o0Var2.m0(c1Var.f2840n);
                int m03 = o0Var2.m0(c1Var.f2841o);
                z0Var.getClass();
                z0.c((a1) obj2, m02, m03, s0.g.f34069a);
                return;
            case 5:
                d1 d1Var = (d1) obj3;
                long j10 = ((w2.h) d1Var.f2848n.invoke((a2.o0) obj2)).f38793a;
                if (d1Var.f2849o) {
                    z0.h(z0Var, (a1) obj, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                    return;
                } else {
                    z0.k(z0Var, (a1) obj, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
                    return;
                }
            case 6:
                b0.g1 g1Var = (b0.g1) obj3;
                if (g1Var.f2868r) {
                    a2.o0 o0Var3 = (a2.o0) obj;
                    z0.g(z0Var, (a1) obj2, o0Var3.m0(g1Var.f2864n), o0Var3.m0(g1Var.f2865o));
                    return;
                }
                a2.o0 o0Var4 = (a2.o0) obj;
                int m04 = o0Var4.m0(g1Var.f2864n);
                int m05 = o0Var4.m0(g1Var.f2865o);
                z0Var.getClass();
                z0.c((a1) obj2, m04, m05, s0.g.f34069a);
                return;
            case 7:
                a2.o0 o0Var5 = (a2.o0) obj2;
                j1 j1Var = (j1) obj;
                int m06 = o0Var5.m0(j1Var.f2887n.d(o0Var5.getLayoutDirection()));
                int m07 = o0Var5.m0(j1Var.f2887n.c());
                z0Var.getClass();
                z0.c((a1) obj3, m06, m07, s0.g.f34069a);
                return;
            default:
                ((m1) obj3).c(z0Var, (k1) obj2, 0, ((a2.o0) obj).getLayoutDirection());
                return;
        }
    }

    public final void f(CommentMetaData it) {
        String commentId;
        String str;
        int i10 = this.f7419a;
        String str2 = null;
        Object obj = this.f7422d;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7420b;
        switch (i10) {
            case 28:
                ((g1) obj2).setValue(it);
                g1 g1Var = (g1) obj3;
                g1Var.setValue(it);
                if (it != null && (commentId = it.getCommentId()) != null) {
                    CommentsViewModel commentsViewModel = (CommentsViewModel) obj;
                    commentsViewModel.getClass();
                    Intrinsics.checkNotNullParameter(commentId, "commentId");
                    yk.g.H(u0.f(commentsViewModel), null, null, new o(commentsViewModel, commentId, null), 3);
                    g1Var.setValue(null);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g1 g1Var2 = (g1) obj3;
                g1Var2.setValue(it);
                CommentMetaData commentMetaData = (CommentMetaData) g1Var2.getValue();
                if (commentMetaData != null) {
                    n nVar = (n) obj2;
                    Intent intent = new Intent((Context) obj, (Class<?>) ReportEntityActivity.class);
                    CreatorMeta creatorInfo = commentMetaData.getCreatorInfo();
                    if (creatorInfo != null) {
                        str = creatorInfo.getDisplayName();
                    } else {
                        str = null;
                    }
                    intent.putExtra("REPORT_USER_NAME", str);
                    CreatorMeta creatorInfo2 = commentMetaData.getCreatorInfo();
                    if (creatorInfo2 != null) {
                        str2 = creatorInfo2.getUserId();
                    }
                    intent.putExtra("USER_ID_TO_BE_REPORTED", str2);
                    intent.putExtra("ENTITY_ID_TO_BE_REPORTED", commentMetaData.getCommentId());
                    intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.Comment);
                    nVar.a(intent);
                    return;
                }
                return;
        }
    }

    public final void i(n1.f0 f0Var) {
        float f10;
        float f11;
        long j10;
        int i10 = this.f7419a;
        Object obj = this.f7420b;
        Object obj2 = this.f7422d;
        Object obj3 = this.f7421c;
        switch (i10) {
            case 1:
                l3 l3Var = (l3) obj;
                float f12 = 1.0f;
                if (l3Var != null) {
                    f10 = ((Number) l3Var.getValue()).floatValue();
                } else {
                    f10 = 1.0f;
                }
                n1.u0 u0Var = (n1.u0) f0Var;
                u0Var.a(f10);
                l3 l3Var2 = (l3) obj3;
                if (l3Var2 != null) {
                    f11 = ((Number) l3Var2.getValue()).floatValue();
                } else {
                    f11 = 1.0f;
                }
                u0Var.i(f11);
                if (l3Var2 != null) {
                    f12 = ((Number) l3Var2.getValue()).floatValue();
                }
                u0Var.j(f12);
                l3 l3Var3 = (l3) obj2;
                if (l3Var3 != null) {
                    j10 = ((b1) l3Var3.getValue()).f28122a;
                } else {
                    j10 = b1.f28120b;
                }
                u0Var.q(j10);
                return;
            default:
                l3 l3Var4 = (l3) obj3;
                float f13 = a4.f25868a;
                n1.u0 u0Var2 = (n1.u0) f0Var;
                u0Var2.i(((Number) l3Var4.getValue()).floatValue());
                u0Var2.j(((Number) l3Var4.getValue()).floatValue());
                u0Var2.a(((Number) ((l3) obj2).getValue()).floatValue());
                u0Var2.q(((b1) ((g1) obj).getValue()).f28122a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j10;
        Integer d10;
        Integer c10;
        Integer c11;
        Integer d11;
        e0 e0Var;
        e0 e0Var2;
        s2 s2Var;
        s2 s2Var2;
        e0 e0Var3;
        e0 e0Var4;
        s2 s2Var3;
        s2 s2Var4;
        Integer c12;
        Integer d12;
        Integer d13;
        Integer c13;
        tr.e eVar;
        ViewGroup viewGroup;
        j0 j0Var;
        androidx.fragment.app.d1 childFragmentManager;
        double d14;
        int i10 = this.f7419a;
        boolean z10 = false;
        int i11 = 1;
        b1 b1Var = null;
        Double d15 = null;
        androidx.fragment.app.d1 supportFragmentManager = null;
        c0 c0Var = null;
        r4 = null;
        c0 c0Var2 = null;
        b1Var = null;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7422d;
        Object obj4 = this.f7420b;
        switch (i10) {
            case 0:
                return a((o0) obj);
            case 1:
                i((n1.f0) obj);
                return Unit.f23355a;
            case 2:
                int ordinal = ((z) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ((i0) obj3).f37532a.getClass();
                            ((h0) obj2).f37527a.getClass();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        b1Var = (b1) obj4;
                    }
                } else {
                    ((h0) obj2).f37527a.getClass();
                    ((i0) obj3).f37532a.getClass();
                }
                if (b1Var != null) {
                    j10 = b1Var.f28122a;
                } else {
                    j10 = b1.f28120b;
                }
                return new b1(j10);
            case 3:
                d(((Number) obj).floatValue());
                return Unit.f23355a;
            case 4:
                e((z0) obj);
                return Unit.f23355a;
            case 5:
                e((z0) obj);
                return Unit.f23355a;
            case 6:
                e((z0) obj);
                return Unit.f23355a;
            case 7:
                e((z0) obj);
                return Unit.f23355a;
            case 8:
                e((z0) obj);
                return Unit.f23355a;
            case 9:
                int intValue = ((Number) obj).intValue();
                u uVar = (u) ((Function0) obj4).mo2invoke();
                if (intValue >= 0 && intValue < uVar.c()) {
                    yk.g.H((f0) obj2, null, null, new k0((g0) obj3, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder n10 = a3.a.n("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                n10.append(uVar.c());
                n10.append(')');
                throw new IllegalArgumentException(n10.toString().toString());
            case 10:
                c0 c0Var3 = (c0) obj;
                ((g1) obj2).setValue(c0Var3);
                g1 g1Var = (g1) obj3;
                boolean z11 = !Intrinsics.a((String) g1Var.getValue(), c0Var3.f30522a.f20699a);
                j2.e eVar2 = c0Var3.f30522a;
                g1Var.setValue(eVar2.f20699a);
                if (z11) {
                    ((Function1) obj4).invoke(eVar2.f20699a);
                }
                return Unit.f23355a;
            case 11:
                j((p1.h) obj);
                return Unit.f23355a;
            case 12:
                Function1 function1 = (Function1) obj2;
                p2.i0 i0Var = (p2.i0) ((iu.z) obj3).f20560a;
                c0 a10 = ((p2.j) obj4).a((List) obj);
                if (i0Var != null) {
                    i0Var.a(null, a10);
                }
                function1.invoke(a10);
                return Unit.f23355a;
            case 13:
                r0 r0Var = (r0) obj;
                int i12 = 4;
                switch ((i0.g1) obj4) {
                    case LEFT_CHAR:
                        r rVar = r.f19166f;
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (j2.f0.b(r0Var.f23768f)) {
                                rVar.invoke(r0Var);
                                break;
                            } else if (r0Var.e()) {
                                int e10 = j2.f0.e(r0Var.f23768f);
                                r0Var.l(e10, e10);
                                break;
                            } else {
                                int d16 = j2.f0.d(r0Var.f23768f);
                                r0Var.l(d16, d16);
                                break;
                            }
                        }
                        break;
                    case RIGHT_CHAR:
                        r rVar2 = r.f19167g;
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (j2.f0.b(r0Var.f23768f)) {
                                rVar2.invoke(r0Var);
                                break;
                            } else if (r0Var.e()) {
                                int d17 = j2.f0.d(r0Var.f23768f);
                                r0Var.l(d17, d17);
                                break;
                            } else {
                                int e11 = j2.f0.e(r0Var.f23768f);
                                r0Var.l(e11, e11);
                                break;
                            }
                        }
                        break;
                    case RIGHT_WORD:
                        l0.a1 a1Var = r0Var.f23767e;
                        a1Var.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (c10 = r0Var.c()) != null) {
                                    int intValue2 = c10.intValue();
                                    r0Var.l(intValue2, intValue2);
                                    break;
                                }
                            } else {
                                a1Var.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (d10 = r0Var.d()) != null) {
                                    int intValue3 = d10.intValue();
                                    r0Var.l(intValue3, intValue3);
                                    break;
                                }
                            }
                        }
                        break;
                    case LEFT_WORD:
                        l0.a1 a1Var2 = r0Var.f23767e;
                        a1Var2.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var2.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (d11 = r0Var.d()) != null) {
                                    int intValue4 = d11.intValue();
                                    r0Var.l(intValue4, intValue4);
                                    break;
                                }
                            } else {
                                a1Var2.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (c11 = r0Var.c()) != null) {
                                    int intValue5 = c11.intValue();
                                    r0Var.l(intValue5, intValue5);
                                    break;
                                }
                            }
                        }
                        break;
                    case NEXT_PARAGRAPH:
                        r0Var.g();
                        break;
                    case PREV_PARAGRAPH:
                        r0Var.h();
                        break;
                    case LINE_START:
                        r0Var.j();
                        break;
                    case LINE_END:
                        r0Var.i();
                        break;
                    case LINE_LEFT:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.j();
                                break;
                            } else {
                                r0Var.i();
                                break;
                            }
                        }
                        break;
                    case LINE_RIGHT:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.i();
                                break;
                            } else {
                                r0Var.j();
                                break;
                            }
                        }
                        break;
                    case UP:
                        if (r0Var.f23769g.f20699a.length() > 0 && (e0Var = r0Var.f23765c) != null) {
                            int f10 = r0Var.f(e0Var, -1);
                            r0Var.l(f10, f10);
                            break;
                        }
                        break;
                    case DOWN:
                        if (r0Var.f23769g.f20699a.length() > 0 && (e0Var2 = r0Var.f23765c) != null) {
                            int f11 = r0Var.f(e0Var2, 1);
                            r0Var.l(f11, f11);
                            break;
                        }
                        break;
                    case PAGE_UP:
                        if (r0Var.f23769g.f20699a.length() > 0 && (s2Var = r0Var.f23818i) != null) {
                            int o10 = r0Var.o(s2Var, -1);
                            r0Var.l(o10, o10);
                            break;
                        }
                        break;
                    case PAGE_DOWN:
                        if (r0Var.f23769g.f20699a.length() > 0 && (s2Var2 = r0Var.f23818i) != null) {
                            int o11 = r0Var.o(s2Var2, 1);
                            r0Var.l(o11, o11);
                            break;
                        }
                        break;
                    case HOME:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            r0Var.l(0, 0);
                            break;
                        }
                        break;
                    case END:
                        r0Var.f23767e.f23709a = null;
                        j2.e eVar3 = r0Var.f23769g;
                        if (eVar3.f20699a.length() > 0) {
                            int length = eVar3.f20699a.length();
                            r0Var.l(length, length);
                            break;
                        }
                        break;
                    case COPY:
                        ((f2) obj2).f18875b.d(false);
                        break;
                    case PASTE:
                        ((f2) obj2).f18875b.m();
                        break;
                    case CUT:
                        ((f2) obj2).f18875b.f();
                        break;
                    case DELETE_PREV_CHAR:
                        List n11 = r0Var.n(r.f19168h);
                        if (n11 != null) {
                            ((f2) obj2).a(n11);
                            break;
                        }
                        break;
                    case DELETE_NEXT_CHAR:
                        List n12 = r0Var.n(r.f19169i);
                        if (n12 != null) {
                            ((f2) obj2).a(n12);
                            break;
                        }
                        break;
                    case DELETE_PREV_WORD:
                        List n13 = r0Var.n(r.f19170j);
                        if (n13 != null) {
                            ((f2) obj2).a(n13);
                            break;
                        }
                        break;
                    case DELETE_NEXT_WORD:
                        List n14 = r0Var.n(r.f19171k);
                        if (n14 != null) {
                            ((f2) obj2).a(n14);
                            break;
                        }
                        break;
                    case DELETE_FROM_LINE_START:
                        List n15 = r0Var.n(r.f19172l);
                        if (n15 != null) {
                            ((f2) obj2).a(n15);
                            break;
                        }
                        break;
                    case DELETE_TO_LINE_END:
                        List n16 = r0Var.n(r.f19173m);
                        if (n16 != null) {
                            ((f2) obj2).a(n16);
                            break;
                        }
                        break;
                    case SELECT_ALL:
                        r0Var.f23767e.f23709a = null;
                        j2.e eVar4 = r0Var.f23769g;
                        if (eVar4.f20699a.length() > 0) {
                            r0Var.l(0, eVar4.f20699a.length());
                            break;
                        }
                        break;
                    case SELECT_LEFT_CHAR:
                        l0.a1 a1Var3 = r0Var.f23767e;
                        a1Var3.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var3.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str = r0Var.f23769g.f20699a;
                                    long j11 = r0Var.f23768f;
                                    int i13 = j2.f0.f20711c;
                                    Object obj5 = q4.a.f31656a;
                                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                    characterInstance.setText(str);
                                    int preceding = characterInstance.preceding((int) (j11 & 4294967295L));
                                    if (preceding != -1) {
                                        r0Var.l(preceding, preceding);
                                    }
                                }
                            } else {
                                a1Var3.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str2 = r0Var.f23769g.f20699a;
                                    long j12 = r0Var.f23768f;
                                    int i14 = j2.f0.f20711c;
                                    Object obj6 = q4.a.f31656a;
                                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                                    characterInstance2.setText(str2);
                                    int following = characterInstance2.following((int) (j12 & 4294967295L));
                                    if (following != -1) {
                                        r0Var.l(following, following);
                                    }
                                }
                            }
                        }
                        r0Var.k();
                        break;
                    case SELECT_RIGHT_CHAR:
                        l0.a1 a1Var4 = r0Var.f23767e;
                        a1Var4.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var4.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str3 = r0Var.f23769g.f20699a;
                                    long j13 = r0Var.f23768f;
                                    int i15 = j2.f0.f20711c;
                                    Object obj7 = q4.a.f31656a;
                                    BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                                    characterInstance3.setText(str3);
                                    int following2 = characterInstance3.following((int) (j13 & 4294967295L));
                                    if (following2 != -1) {
                                        r0Var.l(following2, following2);
                                    }
                                }
                            } else {
                                a1Var4.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str4 = r0Var.f23769g.f20699a;
                                    long j14 = r0Var.f23768f;
                                    int i16 = j2.f0.f20711c;
                                    Object obj8 = q4.a.f31656a;
                                    BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                                    characterInstance4.setText(str4);
                                    int preceding2 = characterInstance4.preceding((int) (j14 & 4294967295L));
                                    if (preceding2 != -1) {
                                        r0Var.l(preceding2, preceding2);
                                    }
                                }
                            }
                        }
                        r0Var.k();
                        break;
                    case SELECT_UP:
                        if (r0Var.f23769g.f20699a.length() > 0 && (e0Var3 = r0Var.f23765c) != null) {
                            int f12 = r0Var.f(e0Var3, -1);
                            r0Var.l(f12, f12);
                        }
                        r0Var.k();
                        break;
                    case SELECT_DOWN:
                        if (r0Var.f23769g.f20699a.length() > 0 && (e0Var4 = r0Var.f23765c) != null) {
                            int f13 = r0Var.f(e0Var4, 1);
                            r0Var.l(f13, f13);
                        }
                        r0Var.k();
                        break;
                    case SELECT_PAGE_UP:
                        if (r0Var.f23769g.f20699a.length() > 0 && (s2Var3 = r0Var.f23818i) != null) {
                            int o12 = r0Var.o(s2Var3, -1);
                            r0Var.l(o12, o12);
                        }
                        r0Var.k();
                        break;
                    case SELECT_PAGE_DOWN:
                        if (r0Var.f23769g.f20699a.length() > 0 && (s2Var4 = r0Var.f23818i) != null) {
                            int o13 = r0Var.o(s2Var4, 1);
                            r0Var.l(o13, o13);
                        }
                        r0Var.k();
                        break;
                    case SELECT_HOME:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            r0Var.l(0, 0);
                        }
                        r0Var.k();
                        break;
                    case SELECT_END:
                        r0Var.f23767e.f23709a = null;
                        j2.e eVar5 = r0Var.f23769g;
                        if (eVar5.f20699a.length() > 0) {
                            int length2 = eVar5.f20699a.length();
                            r0Var.l(length2, length2);
                        }
                        r0Var.k();
                        break;
                    case SELECT_LEFT_WORD:
                        l0.a1 a1Var5 = r0Var.f23767e;
                        a1Var5.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var5.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (d12 = r0Var.d()) != null) {
                                    int intValue6 = d12.intValue();
                                    r0Var.l(intValue6, intValue6);
                                }
                            } else {
                                a1Var5.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (c12 = r0Var.c()) != null) {
                                    int intValue7 = c12.intValue();
                                    r0Var.l(intValue7, intValue7);
                                }
                            }
                        }
                        r0Var.k();
                        break;
                    case SELECT_RIGHT_WORD:
                        l0.a1 a1Var6 = r0Var.f23767e;
                        a1Var6.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var6.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (c13 = r0Var.c()) != null) {
                                    int intValue8 = c13.intValue();
                                    r0Var.l(intValue8, intValue8);
                                }
                            } else {
                                a1Var6.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0 && (d13 = r0Var.d()) != null) {
                                    int intValue9 = d13.intValue();
                                    r0Var.l(intValue9, intValue9);
                                }
                            }
                        }
                        r0Var.k();
                        break;
                    case SELECT_NEXT_PARAGRAPH:
                        r0Var.g();
                        r0Var.k();
                        break;
                    case SELECT_PREV_PARAGRAPH:
                        r0Var.h();
                        r0Var.k();
                        break;
                    case SELECT_LINE_START:
                        r0Var.j();
                        r0Var.k();
                        break;
                    case SELECT_LINE_END:
                        r0Var.i();
                        r0Var.k();
                        break;
                    case SELECT_LINE_LEFT:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.j();
                            } else {
                                r0Var.i();
                            }
                        }
                        r0Var.k();
                        break;
                    case SELECT_LINE_RIGHT:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.i();
                            } else {
                                r0Var.j();
                            }
                        }
                        r0Var.k();
                        break;
                    case DESELECT:
                        r0Var.f23767e.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            long j15 = r0Var.f23768f;
                            int i17 = j2.f0.f20711c;
                            int i18 = (int) (j15 & 4294967295L);
                            r0Var.l(i18, i18);
                            break;
                        }
                        break;
                    case NEW_LINE:
                        f2 f2Var = (f2) obj2;
                        if (!f2Var.f18878e) {
                            f2Var.a(x.a(new p2.a("\n", 1)));
                            break;
                        } else {
                            f2Var.f18874a.f19154u.invoke(new p2.n(f2Var.f18885l));
                            break;
                        }
                    case TAB:
                        f2 f2Var2 = (f2) obj2;
                        if (!f2Var2.f18878e) {
                            f2Var2.a(x.a(new p2.a("\t", 1)));
                            break;
                        } else {
                            ((v) obj3).f20556a = false;
                            break;
                        }
                    case UNDO:
                        f2 f2Var3 = (f2) obj2;
                        b3 b3Var = f2Var3.f18881h;
                        if (b3Var != null) {
                            b3Var.a(c0.a(r0Var.f23817h, r0Var.f23769g, r0Var.f23768f, 4));
                        }
                        b3 b3Var2 = f2Var3.f18881h;
                        if (b3Var2 != null) {
                            tr.e eVar6 = b3Var2.f18801b;
                            if (eVar6 != null && (eVar = (tr.e) eVar6.f36361b) != null) {
                                b3Var2.f18801b = eVar;
                                b3Var2.f18803d -= ((c0) eVar6.f36362c).f30522a.f20699a.length();
                                b3Var2.f18802c = new tr.e(i12, b3Var2.f18802c, (c0) eVar6.f36362c);
                                c0Var2 = (c0) eVar.f36362c;
                            }
                            if (c0Var2 != null) {
                                f2Var3.f18884k.invoke(c0Var2);
                                break;
                            }
                        }
                        break;
                    case REDO:
                        f2 f2Var4 = (f2) obj2;
                        b3 b3Var3 = f2Var4.f18881h;
                        if (b3Var3 != null) {
                            tr.e eVar7 = b3Var3.f18802c;
                            if (eVar7 != null) {
                                b3Var3.f18802c = (tr.e) eVar7.f36361b;
                                c0 c0Var4 = (c0) eVar7.f36362c;
                                b3Var3.f18801b = new tr.e(i12, b3Var3.f18801b, c0Var4);
                                b3Var3.f18803d = c0Var4.f30522a.f20699a.length() + b3Var3.f18803d;
                                c0Var = (c0) eVar7.f36362c;
                            }
                            if (c0Var != null) {
                                f2Var4.f18884k.invoke(c0Var);
                                break;
                            }
                        }
                        break;
                }
                return Unit.f23355a;
            case 14:
                h2.v vVar = (h2.v) obj;
                ou.g[] gVarArr = h2.t.f17908a;
                h2.u uVar2 = h2.r.f17885e;
                ou.g gVar = h2.t.f17908a[2];
                uVar2.a(vVar, (String) obj4);
                p2 p2Var = (p2) obj2;
                if (((q2) p2Var.f26627a.f27120g.getValue()) == q2.f26667b) {
                    ((h2.j) vVar).h(h2.i.f17843s, new h2.a(null, new m0.x(i11, p2Var, (f0) obj3)));
                }
                return Unit.f23355a;
            case 15:
                i((n1.f0) obj);
                return Unit.f23355a;
            case 16:
                d(((Number) obj).floatValue());
                return Unit.f23355a;
            case 17:
                return a((o0) obj);
            case 18:
                return a((o0) obj);
            case 19:
                j1.e eVar8 = (j1.e) obj;
                v vVar2 = (v) obj4;
                boolean z12 = vVar2.f20556a;
                boolean Q0 = eVar8.Q0((j1.a) obj2);
                j1.e eVar9 = (j1.e) obj3;
                if (Q0) {
                    ((d2.x1) ((a0) c2.g.z(eVar9)).getDragAndDropManager()).f13680b.add(eVar8);
                }
                Unit unit = Unit.f23355a;
                vVar2.f20556a = z12 | Q0;
                return Boolean.TRUE;
            case 20:
                c2 c2Var = (c2) obj;
                if (c2Var instanceof j1.c) {
                    j1.c cVar = (j1.c) c2Var;
                    if (((d2.x1) ((a0) c2.g.z((j1.e) obj2)).getDragAndDropManager()).f13680b.contains(cVar)) {
                        j1.a aVar = (j1.a) obj3;
                        if (t0.t.m(cVar, t0.t.g(aVar.f20623a.getX(), aVar.f20623a.getY()))) {
                            ((iu.z) obj4).f20560a = c2Var;
                            return b2.f7664c;
                        }
                    }
                }
                return b2.f7662a;
            case 21:
                l1.t tVar = (l1.t) obj;
                if (!Intrinsics.a(tVar, (l1.t) obj4)) {
                    if (!Intrinsics.a(tVar, ((androidx.compose.ui.focus.b) obj2).f1363d)) {
                        z10 = ((Boolean) ((Function1) obj3).invoke(tVar)).booleanValue();
                    } else {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                }
                return Boolean.valueOf(z10);
            case 22:
                View view = (View) obj;
                Object tag = view.getTag(R.id.binding_reference);
                Intrinsics.d(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                ((Function1) obj4).invoke((w7.a) tag);
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) obj2;
                    Context context = (Context) obj3;
                    if (g0Var != null && (childFragmentManager = g0Var.getChildFragmentManager()) != null) {
                        supportFragmentManager = childFragmentManager;
                    } else {
                        if (context instanceof j0) {
                            j0Var = (j0) context;
                        } else {
                            j0Var = null;
                        }
                        if (j0Var != null) {
                            supportFragmentManager = j0Var.getSupportFragmentManager();
                        }
                    }
                    yk.j.V0(viewGroup, new e1(supportFragmentManager, 8));
                }
                return Unit.f23355a;
            case 23:
                j((p1.h) obj);
                return Unit.f23355a;
            case 24:
                androidx.navigation.n backStackEntry = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                androidx.navigation.c0 c0Var5 = backStackEntry.f2258b;
                if (!(c0Var5 instanceof androidx.navigation.c0)) {
                    c0Var5 = null;
                }
                if (c0Var5 == null) {
                    return null;
                }
                v0 v0Var = (v0) obj4;
                a3.a.u(obj3);
                androidx.navigation.c0 destination = v0Var.c(c0Var5, backStackEntry.a(), (androidx.navigation.k0) obj2);
                if (destination == null) {
                    return null;
                }
                if (Intrinsics.a(destination, c0Var5)) {
                    return backStackEntry;
                }
                q b10 = v0Var.b();
                Bundle e12 = destination.e(backStackEntry.a());
                Intrinsics.checkNotNullParameter(destination, "destination");
                int i19 = androidx.navigation.n.f2256m;
                androidx.navigation.t tVar2 = b10.f2285h;
                return p.q(tVar2.f2304a, destination, e12, tVar2.i(), tVar2.f2318o);
            case 25:
                if (((t) obj) != null) {
                    FragmentNavigator fragmentNavigator = (FragmentNavigator) obj4;
                    androidx.fragment.app.g0 g0Var2 = (androidx.fragment.app.g0) obj2;
                    if (!vt.g0.q(fragmentNavigator.m(), g0Var2.getTag())) {
                        androidx.lifecycle.o lifecycle = g0Var2.getViewLifecycleOwner().getLifecycle();
                        if (lifecycle.b().a(androidx.lifecycle.n.f1949c)) {
                            lifecycle.a((androidx.lifecycle.s) fragmentNavigator.f2200h.invoke((androidx.navigation.n) obj3));
                        }
                    }
                }
                return Unit.f23355a;
            case 26:
                return h.c.i((h.c) obj4, (g7.c0) obj, (g7.a1) obj2, (g7.a1) obj3);
            case 27:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                tu.k1 k1Var = ((ModifyOrderPageBottomSheetViewModel) obj4).f8638m;
                Double e13 = kotlin.text.q.e(it);
                if (e13 != null) {
                    d14 = e13.doubleValue();
                } else {
                    FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) ((l3) obj3).getValue();
                    if (fnoOrderInfoResponseDto != null) {
                        d15 = Double.valueOf(fnoOrderInfoResponseDto.getLtp());
                    }
                    if (d15 != null) {
                        d14 = d15.doubleValue();
                    } else {
                        d14 = 0.0d;
                    }
                }
                k1Var.m(Double.valueOf(d14));
                ((g1) obj2).setValue(it);
                return Unit.f23355a;
            case 28:
                f((CommentMetaData) obj);
                return Unit.f23355a;
            default:
                f((CommentMetaData) obj);
                return Unit.f23355a;
        }
    }

    public final void j(p1.h hVar) {
        boolean z10;
        long j10;
        float f10;
        a0 a0Var;
        int i10 = this.f7419a;
        boolean z11 = false;
        Object obj = this.f7422d;
        Object obj2 = this.f7421c;
        Object obj3 = this.f7420b;
        switch (i10) {
            case 11:
                i0.q1 q1Var = (i0.q1) obj3;
                s2 d10 = q1Var.d();
                if (d10 != null) {
                    c0 c0Var = (c0) obj2;
                    p2.v vVar = (p2.v) obj;
                    n1.r a10 = hVar.f0().a();
                    boolean b10 = j2.f0.b(c0Var.f30523b);
                    e0 e0Var = d10.f19194a;
                    if (!b10) {
                        long j11 = c0Var.f30523b;
                        int b11 = vVar.b(j2.f0.e(j11));
                        int b12 = vVar.b(j2.f0.d(j11));
                        if (b11 != b12) {
                            a10.o(e0Var.n(b11, b12), q1Var.f19155v);
                        }
                    }
                    float f11 = (int) (e0Var.f20705c >> 32);
                    j2.l lVar = e0Var.f20704b;
                    if (f11 >= lVar.f20733d && !lVar.f20732c && ((int) (r3 & 4294967295L)) >= lVar.f20734e) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    d0 d0Var = e0Var.f20703a;
                    if (z10 && !kp.j.N(d0Var.f20694f, 3)) {
                        z11 = true;
                    }
                    if (z11) {
                        long j12 = e0Var.f20705c;
                        m1.d h10 = t0.t.h(m1.c.f27233b, t0.t.j((int) (j12 >> 32), (int) (j12 & 4294967295L)));
                        a10.h();
                        n1.r.m(a10, h10);
                    }
                    b0 b0Var = d0Var.f20690b.f20722a;
                    u2.j jVar = b0Var.f20671m;
                    u2.n nVar = b0Var.f20659a;
                    if (jVar == null) {
                        jVar = u2.j.f36684b;
                    }
                    u2.j jVar2 = jVar;
                    w0 w0Var = b0Var.f20672n;
                    if (w0Var == null) {
                        w0Var = w0.f28204d;
                    }
                    w0 w0Var2 = w0Var;
                    p1.i iVar = b0Var.f20674p;
                    if (iVar == null) {
                        iVar = p1.k.f30509a;
                    }
                    p1.i iVar2 = iVar;
                    try {
                        n1.p b13 = nVar.b();
                        u2.l lVar2 = u2.l.f36689a;
                        if (b13 != null) {
                            if (nVar != lVar2) {
                                f10 = nVar.c();
                            } else {
                                f10 = 1.0f;
                            }
                            j2.l.c(e0Var.f20704b, a10, b13, f10, w0Var2, jVar2, iVar2);
                        } else {
                            if (nVar != lVar2) {
                                j10 = nVar.a();
                            } else {
                                j10 = n1.t.f28170b;
                            }
                            j2.l.b(e0Var.f20704b, a10, j10, w0Var2, jVar2, iVar2);
                        }
                        if (z11) {
                            a10.s();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (z11) {
                            a10.s();
                        }
                        throw th2;
                    }
                }
                return;
            default:
                y2.k kVar = (y2.k) obj3;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj2;
                y2.k kVar2 = (y2.k) obj;
                n1.r a11 = hVar.f0().a();
                if (kVar.getView().getVisibility() != 8) {
                    kVar.f41112u = true;
                    r1 r1Var = aVar.f1408i;
                    if (r1Var instanceof a0) {
                        a0Var = (a0) r1Var;
                    } else {
                        a0Var = null;
                    }
                    if (a0Var != null) {
                        Canvas a12 = n1.d.a(a11);
                        a0Var.getAndroidViewsHandler$ui_release().getClass();
                        kVar2.draw(a12);
                    }
                    kVar.f41112u = false;
                    return;
                }
                return;
        }
    }
}
