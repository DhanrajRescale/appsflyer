package w;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.social.presentation.video.VideoFullScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.n2;

/* loaded from: classes.dex */
public final class r0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Number number, l0 l0Var, Number number2, k0 k0Var) {
        super(0);
        this.f38663a = 0;
        this.f38664b = number;
        this.f38666d = l0Var;
        this.f38665c = number2;
        this.f38667e = k0Var;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10 = this.f38663a;
        String str6 = null;
        Object obj = this.f38665c;
        Object obj2 = this.f38664b;
        Object obj3 = this.f38667e;
        Object obj4 = this.f38666d;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) obj4;
                if (!Intrinsics.a(obj2, l0Var.f38581a) || !Intrinsics.a(obj, l0Var.f38582b)) {
                    Object obj5 = this.f38664b;
                    Object obj6 = this.f38665c;
                    l0Var.f38581a = obj5;
                    l0Var.f38582b = obj6;
                    l0Var.f38585e = new m1((k0) obj3, l0Var.f38583c, obj5, obj6, null);
                    l0Var.f38589i.f38644b.setValue(Boolean.TRUE);
                    l0Var.f38586f = false;
                    l0Var.f38587g = true;
                    return;
                }
                return;
            case 1:
                ((o0.k) obj2).h((Function0) obj, (w2.k) obj3);
                return;
            case 2:
                t0.r rVar = (t0.r) obj2;
                u0.b bVar = rVar.L;
                u0.a aVar = (u0.a) obj;
                n2 n2Var = (n2) obj4;
                t0.c1 c1Var = (t0.c1) obj3;
                u0.a aVar2 = bVar.f36606b;
                try {
                    bVar.f36606b = aVar;
                    n2 n2Var2 = rVar.F;
                    int[] iArr = rVar.f35179n;
                    v0.d dVar = rVar.f35186u;
                    rVar.f35179n = null;
                    rVar.f35186u = null;
                    try {
                        rVar.F = n2Var;
                        boolean z10 = bVar.f36609e;
                        try {
                            bVar.f36609e = false;
                            c1Var.getClass();
                            c1Var.getClass();
                            c1Var.getClass();
                            t0.r.b(rVar, null, null);
                            bVar.f36609e = z10;
                            Unit unit = Unit.f23355a;
                            return;
                        } catch (Throwable th2) {
                            bVar.f36609e = z10;
                            throw th2;
                        }
                    } finally {
                        rVar.F = n2Var2;
                        rVar.f35179n = iArr;
                        rVar.f35186u = dVar;
                    }
                } finally {
                    bVar.f36606b = aVar2;
                }
            case 3:
                ((z2.p) obj2).f((Function0) obj, (z2.o) obj4, (w2.k) obj3);
                return;
            case 4:
            case 5:
            default:
                Boolean bool = Boolean.TRUE;
                ((t0.g1) obj4).setValue(bool);
                qs.e eVar = (qs.e) ((t0.g1) obj3).getValue();
                if (eVar != null) {
                    us.g gVar = (us.g) eVar;
                    gVar.a(gVar.f37378a, "playVideo", new Object[0]);
                }
                Function2 function2 = (Function2) obj2;
                if (function2 != null) {
                    function2.invoke(bool, (String) obj);
                    return;
                }
                return;
            case 6:
                hb.k kVar = (hb.k) obj2;
                if (kVar != null) {
                    str6 = kVar.f18197a;
                }
                if (str6 != null && str6.length() != 0) {
                    if (kVar != null && (str5 = kVar.f18198b) != null && kotlin.text.w.s(str5, "image", false)) {
                        ((Function0) obj).mo2invoke();
                        return;
                    }
                    if (kVar != null && (str4 = kVar.f18198b) != null && kotlin.text.w.s(str4, "video", false)) {
                        boolean s7 = kotlin.text.w.s(kVar.f18200d, "youtube", false);
                        String str7 = kVar.f18197a;
                        if (s7) {
                            yk.j.s0((Context) obj4, str7);
                            return;
                        }
                        Context context = (Context) obj4;
                        Intent intent = new Intent(context, (Class<?>) VideoFullScreenActivity.class);
                        intent.putExtra("VIDEO_URL", str7);
                        context.startActivity(intent);
                        return;
                    }
                    if (kVar != null && (str3 = kVar.f18198b) != null && kotlin.text.w.s(str3, "pdf", false)) {
                        ((Function0) obj3).mo2invoke();
                        return;
                    }
                    if ((kVar != null && (str2 = kVar.f18198b) != null && kotlin.text.w.s(str2, "youtube", false)) || (kVar != null && (str = kVar.f18198b) != null && kotlin.text.w.s(str, "shorts", false))) {
                        yk.j.s0((Context) obj4, kVar.f18197a);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                hb.s sVar = (hb.s) obj2;
                if (!sVar.f18227d.f18220g) {
                    Context context2 = (Context) obj;
                    String text = context2.getString(R.string.follow_group_to_interact_message);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context2.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                }
                if (!sVar.f18229f.f18211b.f18206a) {
                    Context context3 = (Context) obj;
                    String text2 = context3.getString(R.string.comments_are_not_allowed);
                    Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intrinsics.checkNotNullParameter(text2, "text");
                    if (text2.length() != 0) {
                        Toast makeText2 = Toast.makeText(context3, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService2 = context3.getSystemService("layout_inflater");
                        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        return;
                    }
                    return;
                }
                Function1 function1 = (Function1) obj4;
                if (function1 != null) {
                    function1.invoke((hb.u) obj3);
                    return;
                }
                return;
            case 8:
                el.l.u0((Context) obj2, (String) obj, (String) obj4, (String) obj3);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f38663a;
        Object obj = this.f38667e;
        Object obj2 = this.f38666d;
        Object obj3 = this.f38665c;
        Object obj4 = this.f38664b;
        switch (i10) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                return new EditProfileViewModel((pj.a) obj4, (ct.a) obj3, (UserRepository) obj2, (mj.a) obj);
            case 5:
                return new NotificationsViewModel((pj.a) obj4, (ct.a) obj3, (NotificationsRepository) obj2, (UserRepository) obj);
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            case 8:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f38663a = i10;
        this.f38664b = obj;
        this.f38665c = obj2;
        this.f38666d = obj3;
        this.f38667e = obj4;
    }
}
