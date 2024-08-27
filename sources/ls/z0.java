package ls;

import android.R;
import android.content.Context;

/* loaded from: classes2.dex */
public final class z0 extends l.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25370d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, int i10, String str) {
        super(context, 3);
        this.f25370d = i10;
        if (i10 != 1) {
            this.f25371e = str;
            h();
        } else {
            super(context, 3);
            this.f25371e = str;
            h();
        }
    }

    @Override // l.d
    public final String d() {
        int i10 = this.f25370d;
        String str = this.f25371e;
        switch (i10) {
            case 0:
                return jr.h.r(str, ".R$drawable");
            default:
                return jr.h.r(str, ".R$id");
        }
    }

    @Override // l.d
    public final Class f() {
        switch (this.f25370d) {
            case 0:
                return R.drawable.class;
            default:
                return R.id.class;
        }
    }
}
