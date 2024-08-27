package rh;

import android.util.Patterns;
import android.widget.ImageView;
import ba.zb;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f33739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f33738a = i10;
        this.f33739b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f33738a;
        d dVar = this.f33739b;
        switch (i10) {
            case 0:
                Intrinsics.c(str);
                dVar.getClass();
                Intrinsics.checkNotNullParameter(str, "<this>");
                boolean matches = Patterns.WEB_URL.matcher(str).matches();
                m mVar = dVar.f17291u;
                if (matches) {
                    zb zbVar = (zb) mVar;
                    zbVar.f6832s.setVisibility(8);
                    zbVar.f6837x.setVisibility(8);
                    zbVar.f6833t.setVisibility(0);
                    return;
                }
                zb zbVar2 = (zb) mVar;
                zbVar2.f6832s.setVisibility(0);
                zbVar2.f6837x.setVisibility(0);
                zbVar2.f6833t.setVisibility(8);
                zbVar2.f6832s.setText(str);
                return;
            case 1:
                ((zb) dVar.f17291u).f6834u.setText(str);
                return;
            case 2:
                ((zb) dVar.f17291u).A.setText(str);
                return;
            case 3:
                ((zb) dVar.f17291u).f6839z.setText(str);
                return;
            case 4:
                ((zb) dVar.f17291u).f6838y.setText(str);
                return;
            case 5:
                ((zb) dVar.f17291u).f6835v.setText(str);
                return;
            default:
                ImageView imageView = ((zb) dVar.f17291u).f6836w;
                com.bumptech.glide.b.f(imageView).m(str).z(imageView);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f33738a) {
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
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
