package h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import java.io.File;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class b0 implements ek.x, js.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f17579a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17580b;

    public b0() {
        this.f17580b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public final void a() {
        Object obj = this.f17579a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((e0) this.f17580b).f17632k.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f17579a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public final String d(String str) {
        String str2 = (String) ((TreeMap) this.f17580b).get(str);
        if (str2 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str2;
    }

    public final boolean e(String str) {
        return ((TreeMap) this.f17580b).containsKey(str);
    }

    @Override // ek.x
    public final ek.w f(ek.c0 c0Var) {
        Context context = (Context) this.f17579a;
        Class cls = (Class) this.f17580b;
        return new fk.e(context, c0Var.a(File.class, cls), c0Var.a(Uri.class, cls), cls);
    }

    public abstract void g();

    public final void h(String str, String str2) {
        ((TreeMap) this.f17580b).put(str, str2);
    }

    public final void i() {
        a();
        IntentFilter b10 = b();
        if (b10 != null && b10.countActions() != 0) {
            if (((BroadcastReceiver) this.f17579a) == null) {
                this.f17579a = new a0(this, 0);
            }
            ((e0) this.f17580b).f17632k.registerReceiver((BroadcastReceiver) this.f17579a, b10);
        }
    }

    public b0(Context context, Class cls) {
        this.f17579a = context;
        this.f17580b = cls;
    }

    public b0(e0 e0Var) {
        this.f17580b = e0Var;
    }
}
