package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f27355a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27356b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27357c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27358d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27359e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f27355a = Float.NaN;
        this.f27356b = Float.NaN;
        this.f27357c = Float.NaN;
        this.f27358d = Float.NaN;
        this.f27359e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f27465j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f27359e);
                this.f27359e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f27358d = obtainStyledAttributes.getDimension(index, this.f27358d);
            } else if (index == 2) {
                this.f27356b = obtainStyledAttributes.getDimension(index, this.f27356b);
            } else if (index == 3) {
                this.f27357c = obtainStyledAttributes.getDimension(index, this.f27357c);
            } else if (index == 4) {
                this.f27355a = obtainStyledAttributes.getDimension(index, this.f27355a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
