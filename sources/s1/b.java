package s1;

import android.R;
import android.graphics.Shader;
import l0.j;
import n1.p;
import n1.q;
import n1.z0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34178a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f34179b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f34180c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f34181d = {R.attr.name, R.attr.pathData};

    public static final p a(j jVar) {
        boolean z10;
        Object obj = jVar.f23774b;
        if (((Shader) obj) != null || jVar.f23773a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Shader shader = (Shader) obj;
            if (shader != null) {
                return new q(shader);
            }
            return new z0(androidx.compose.ui.graphics.a.c(jVar.f23773a));
        }
        return null;
    }
}
