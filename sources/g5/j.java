package g5;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16579a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16580b;

    public j(Context context) {
        l lVar = new l();
        this.f16579a = context.getApplicationContext();
        this.f16580b = lVar;
    }

    @Override // g5.e
    public final f a() {
        return new k(this.f16579a, this.f16580b.a());
    }
}
