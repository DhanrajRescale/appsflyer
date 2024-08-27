package xf;

import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import ba.h9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f40212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f40211a = i10;
        this.f40212b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40211a;
        g gVar = this.f40212b;
        switch (i10) {
            case 0:
                ((h9) gVar.f17291u).f4915u.setText((String) obj);
                return Unit.f23355a;
            default:
                TextView textView = ((h9) gVar.f17291u).f4913s;
                textView.setText((Spanned) obj);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return Unit.f23355a;
        }
    }
}
