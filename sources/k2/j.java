package k2;

import android.os.Build;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements p {
    @Override // k2.p
    @NotNull
    public StaticLayout a(@NotNull q qVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(qVar.f21937a, qVar.f21938b, qVar.f21939c, qVar.f21940d, qVar.f21941e);
        obtain.setTextDirection(qVar.f21942f);
        obtain.setAlignment(qVar.f21943g);
        obtain.setMaxLines(qVar.f21944h);
        obtain.setEllipsize(qVar.f21945i);
        obtain.setEllipsizedWidth(qVar.f21946j);
        obtain.setLineSpacing(qVar.f21948l, qVar.f21947k);
        obtain.setIncludePad(qVar.f21950n);
        obtain.setBreakStrategy(qVar.f21952p);
        obtain.setHyphenationFrequency(qVar.f21955s);
        obtain.setIndents(qVar.f21956t, qVar.f21957u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            k.a(obtain, qVar.f21949m);
        }
        if (i10 >= 28) {
            l.a(obtain, qVar.f21951o);
        }
        if (i10 >= 33) {
            n.b(obtain, qVar.f21953q, qVar.f21954r);
        }
        return obtain.build();
    }
}
