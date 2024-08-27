package os;

import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f30350a;

    /* renamed from: b, reason: collision with root package name */
    public final o f30351b = new o();

    public k0(List list) {
        this.f30350a = list;
    }

    public abstract void a(View view);

    public abstract void b();

    public void c(View view) {
        this.f30351b.c(view, this.f30350a, this);
    }
}
