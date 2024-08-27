package ok;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f30107d;

    /* renamed from: a, reason: collision with root package name */
    public final View f30108a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30109b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public o3.f f30110c;

    public h(View view) {
        this.f30108a = view;
    }

    public final int a(int i10, int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        View view = this.f30108a;
        if (!view.isLayoutRequested() && i11 == -2) {
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f30107d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                al.d.V(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f30107d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f30107d.intValue();
        }
        return 0;
    }
}
