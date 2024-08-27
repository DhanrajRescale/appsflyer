package k9;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import w9.e;

/* loaded from: classes.dex */
public final class a extends Paint {
    public a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = e.f38891a;
            setColor((Math.max(0, Math.min(255, i10)) << 24) | (color & 16777215));
        } else {
            PointF pointF2 = e.f38891a;
            super.setAlpha(Math.max(0, Math.min(255, i10)));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
