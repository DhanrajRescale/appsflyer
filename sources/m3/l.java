package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f27431a;

    /* renamed from: b, reason: collision with root package name */
    public int f27432b;

    /* renamed from: c, reason: collision with root package name */
    public float f27433c;

    /* renamed from: d, reason: collision with root package name */
    public float f27434d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f27462g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f27433c = obtainStyledAttributes.getFloat(index, this.f27433c);
            } else if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.f27431a);
                this.f27431a = i11;
                this.f27431a = n.f27449d[i11];
            } else if (index == 4) {
                this.f27432b = obtainStyledAttributes.getInt(index, this.f27432b);
            } else if (index == 3) {
                this.f27434d = obtainStyledAttributes.getFloat(index, this.f27434d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
