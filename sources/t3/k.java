package t3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f35313a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f35314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35315c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f35313a = colorStateList;
        this.f35314b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f35315c = hashCode;
    }
}
