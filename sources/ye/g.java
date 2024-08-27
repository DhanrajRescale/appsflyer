package ye;

import android.widget.ImageView;
import ba.f9;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f41610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f41609a = i10;
        this.f41610b = hVar;
    }

    public final void a(String str) {
        int i10 = this.f41609a;
        h hVar = this.f41610b;
        switch (i10) {
            case 0:
                ((f9) hVar.f17291u).f4686t.setText(str);
                return;
            case 1:
                ImageView imageView = ((f9) hVar.f17291u).f4687u;
                ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView).m(str).b()).z(imageView);
                return;
            default:
                ((f9) hVar.f17291u).f4685s.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f41609a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
