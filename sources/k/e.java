package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f21748f;

    /* renamed from: a, reason: collision with root package name */
    public int f21749a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f21750b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f21751c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f21752d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f21753e;

    public e(Context context, int i10) {
        super(context);
        this.f21749a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f21753e == null) {
            if (this.f21752d == null) {
                this.f21752d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f21750b == null) {
            this.f21750b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f21750b.setTo(theme);
            }
        }
        this.f21750b.applyStyle(this.f21749a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(k.e.f21748f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f21753e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f21752d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = k.e.f21748f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            k.e.f21748f = r1
        L1c:
            android.content.res.Configuration r1 = k.e.f21748f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f21752d
            android.content.Context r0 = k.d.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f21753e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f21753e = r0
        L38:
            android.content.res.Resources r0 = r3.f21753e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f21751c == null) {
                this.f21751c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f21751c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f21750b;
        if (theme != null) {
            return theme;
        }
        if (this.f21749a == 0) {
            this.f21749a = 2132083409;
        }
        b();
        return this.f21750b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f21749a != i10) {
            this.f21749a = i10;
            b();
        }
    }

    public e(Context context, Resources.Theme theme) {
        super(context);
        this.f21750b = theme;
    }
}
