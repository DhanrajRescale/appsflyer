package l;

import android.content.Context;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.textfield.TextInputLayout;
import in.juspay.hyper.constants.LogSubCategory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import t.j0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f23559a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23560b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23561c;

    public d(TextInputLayout textInputLayout) {
        this.f23560b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f23559a = textInputLayout;
    }

    public static void k(Class cls, String str, Map map) {
        try {
            for (Field field : cls.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE) {
                    try {
                        String name = field.getName();
                        int i10 = field.getInt(null);
                        if (str != null) {
                            name = str + ":" + name;
                        }
                        map.put(name, Integer.valueOf(i10));
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        el.l.N("MixpanelAPI.RsrcReader", "Can't read built-in id name from " + cls.getName(), e10);
                    }
                }
            }
        } catch (IllegalAccessException e11) {
            el.l.N("MixpanelAPI.RsrcReader", "Can't read built-in id names from ".concat(cls.getName()), e11);
        }
    }

    public abstract void c();

    public abstract String d();

    public final MenuItem e(MenuItem menuItem) {
        if (menuItem instanceof w3.b) {
            w3.b bVar = (w3.b) menuItem;
            if (((j0) this.f23560b) == null) {
                this.f23560b = new j0();
            }
            MenuItem menuItem2 = (MenuItem) ((j0) this.f23560b).get(bVar);
            if (menuItem2 == null) {
                w wVar = new w((Context) this.f23559a, bVar);
                ((j0) this.f23560b).put(bVar, wVar);
                return wVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract Class f();

    public final int g(String str) {
        return ((Integer) ((Map) this.f23560b).get(str)).intValue();
    }

    public final void h() {
        ((Map) this.f23560b).clear();
        ((SparseArray) this.f23561c).clear();
        k(f(), LogSubCategory.LifeCycle.ANDROID, (Map) this.f23560b);
        String d10 = d();
        try {
            k(Class.forName(d10), null, (Map) this.f23560b);
        } catch (ClassNotFoundException unused) {
            el.l.V0("MixpanelAPI.RsrcReader", "Can't load names for Android view ids from '" + d10 + "', ids by name will not be available in the events editor.");
            el.l.l0("MixpanelAPI.RsrcReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
        }
        for (Map.Entry entry : ((Map) this.f23560b).entrySet()) {
            ((SparseArray) this.f23561c).put(((Integer) entry.getValue()).intValue(), entry.getKey());
        }
    }

    public abstract void i();

    public abstract boolean j(CharSequence charSequence);

    public abstract void l(oo.c cVar);

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public final boolean p(CharSequence charSequence) {
        if (((String) this.f23561c) != null && (charSequence == null || charSequence.length() == 0)) {
            ((TextInputLayout) this.f23559a).setError((String) this.f23561c);
            return false;
        }
        if (j(charSequence)) {
            ((TextInputLayout) this.f23559a).setError(HttpUrl.FRAGMENT_ENCODE_SET);
            return true;
        }
        ((TextInputLayout) this.f23559a).setError((String) this.f23560b);
        return false;
    }

    public d(Context context, int i10) {
        if (i10 != 3) {
            this.f23559a = context;
            return;
        }
        this.f23559a = context;
        this.f23560b = new HashMap();
        this.f23561c = new SparseArray();
    }

    public d(int i10) {
        this.f23560b = new float[i10 * 2];
        this.f23561c = new int[i10];
    }
}
