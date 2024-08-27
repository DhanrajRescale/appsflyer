package i9;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import r3.k;

/* loaded from: classes.dex */
public final class c {
    public static int a(View dimenPx, int i10) {
        Intrinsics.e(dimenPx, "$this$dimenPx");
        Context context = dimenPx.getContext();
        Intrinsics.b(context, "context");
        return context.getResources().getDimensionPixelSize(i10);
    }

    public static int b(Context context, Integer num, Integer num2, f9.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            aVar = null;
        }
        Intrinsics.e(context, "context");
        int i11 = 0;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                if (color == 0 && aVar != null) {
                    color = ((Number) aVar.mo2invoke()).intValue();
                }
                return color;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (num != null) {
            i11 = num.intValue();
        }
        return k.getColor(context, i11);
    }
}
