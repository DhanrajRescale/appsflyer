package o9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f29862d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f29863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29864b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29865c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f29864b = str.concat("/");
        } else {
            this.f29864b = str;
        }
        this.f29865c = map;
        if (!(callback instanceof View)) {
            this.f29863a = null;
        } else {
            this.f29863a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
