package o3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f29544a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29547d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29548e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29549f;

    /* renamed from: g, reason: collision with root package name */
    public int f29550g;

    /* renamed from: h, reason: collision with root package name */
    public int f29551h;

    /* renamed from: i, reason: collision with root package name */
    public int f29552i;

    /* renamed from: j, reason: collision with root package name */
    public int f29553j;

    /* renamed from: k, reason: collision with root package name */
    public View f29554k;

    /* renamed from: l, reason: collision with root package name */
    public View f29555l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29556m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29557n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29558o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29559p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f29560q;

    public e() {
        super(-2, -2);
        this.f29545b = false;
        this.f29546c = 0;
        this.f29547d = 0;
        this.f29548e = -1;
        this.f29549f = -1;
        this.f29550g = 0;
        this.f29551h = 0;
        this.f29560q = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f29557n;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f29558o;
    }

    public final void b(b bVar) {
        b bVar2 = this.f29544a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f();
            }
            this.f29544a = bVar;
            this.f29545b = true;
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f29545b = false;
        this.f29546c = 0;
        this.f29547d = 0;
        this.f29548e = -1;
        this.f29549f = -1;
        this.f29550g = 0;
        this.f29551h = 0;
        this.f29560q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3.a.f28234b);
        this.f29546c = obtainStyledAttributes.getInteger(0, 0);
        this.f29549f = obtainStyledAttributes.getResourceId(1, -1);
        this.f29547d = obtainStyledAttributes.getInteger(2, 0);
        this.f29548e = obtainStyledAttributes.getInteger(6, -1);
        this.f29550g = obtainStyledAttributes.getInt(5, 0);
        this.f29551h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f29545b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1466t;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1466t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1468v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1467u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(a3.a.f("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f29544a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f29544a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f29545b = false;
        this.f29546c = 0;
        this.f29547d = 0;
        this.f29548e = -1;
        this.f29549f = -1;
        this.f29550g = 0;
        this.f29551h = 0;
        this.f29560q = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f29545b = false;
        this.f29546c = 0;
        this.f29547d = 0;
        this.f29548e = -1;
        this.f29549f = -1;
        this.f29550g = 0;
        this.f29551h = 0;
        this.f29560q = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f29545b = false;
        this.f29546c = 0;
        this.f29547d = 0;
        this.f29548e = -1;
        this.f29549f = -1;
        this.f29550g = 0;
        this.f29551h = 0;
        this.f29560q = new Rect();
    }
}
