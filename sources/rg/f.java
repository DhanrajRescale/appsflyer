package rg;

import android.widget.ImageView;
import android.widget.TextView;
import ba.v8;
import ek.u;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f33735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f33734a = i10;
        this.f33735b = gVar;
    }

    public final void a(String str) {
        int i10 = this.f33734a;
        g gVar = this.f33735b;
        switch (i10) {
            case 0:
                ((v8) gVar.f17291u).f6400w.setText(str);
                return;
            case 1:
                ((v8) gVar.f17291u).f6401x.setText(str);
                return;
            case 2:
                ((v8) gVar.f17291u).f6403z.setText(str);
                return;
            case 3:
                ((v8) gVar.f17291u).f6396s.setText(str);
                return;
            case 4:
                ((v8) gVar.f17291u).f6397t.setText(str);
                return;
            case 5:
                ((v8) gVar.f17291u).A.setText(str);
                return;
            case 6:
                ((v8) gVar.f17291u).f6398u.setText(str);
                boolean a10 = Intrinsics.a(str, "0.0 %");
                m mVar = gVar.f17291u;
                if (!a10 && !Intrinsics.a(str, "-0.0 %")) {
                    ((v8) mVar).f6399v.setVisibility(0);
                    return;
                } else {
                    ((v8) mVar).f6399v.setVisibility(8);
                    return;
                }
            default:
                Intrinsics.c(str);
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("FrozenPortfolioOptionViewHolder", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "FrozenPortfolioOptionViewHolder").getClass();
                u.k(objArr);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(gVar.f22629a.getContext()).m(str).e()).i()).z(((v8) gVar.f17291u).B);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33734a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            case 7:
                Boolean bool = (Boolean) obj;
                g gVar = this.f33735b;
                TextView profitLossText = ((v8) gVar.f17291u).f6402y;
                Intrinsics.checkNotNullExpressionValue(profitLossText, "profitLossText");
                bh.a.e(profitLossText, bool);
                ImageView changeTypeIcon = ((v8) gVar.f17291u).f6399v;
                Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                bh.a.d(changeTypeIcon, bool);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
