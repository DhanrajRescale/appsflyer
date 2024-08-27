package ls;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25121b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f25122c;

    public a1(Context context, String str, l0 l0Var) {
        this.f25120a = context;
        this.f25121b = str;
        this.f25122c = l0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences = this.f25120a.getSharedPreferences(this.f25121b, 0);
        l0 l0Var = this.f25122c;
        if (l0Var != null) {
            Integer num = y0.f25348p;
            String string = sharedPreferences.getString("people_distinct_id", null);
            if (string != null) {
                n0 n0Var = l0Var.f25236a;
                e eVar = new e(string, n0Var.f25262d);
                i iVar = n0Var.f25260b;
                iVar.getClass();
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = eVar;
                iVar.f25224a.b(obtain);
            }
        }
        return sharedPreferences;
    }
}
