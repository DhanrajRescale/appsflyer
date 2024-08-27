package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f27435n;

    /* renamed from: a, reason: collision with root package name */
    public float f27436a;

    /* renamed from: b, reason: collision with root package name */
    public float f27437b;

    /* renamed from: c, reason: collision with root package name */
    public float f27438c;

    /* renamed from: d, reason: collision with root package name */
    public float f27439d;

    /* renamed from: e, reason: collision with root package name */
    public float f27440e;

    /* renamed from: f, reason: collision with root package name */
    public float f27441f;

    /* renamed from: g, reason: collision with root package name */
    public float f27442g;

    /* renamed from: h, reason: collision with root package name */
    public int f27443h;

    /* renamed from: i, reason: collision with root package name */
    public float f27444i;

    /* renamed from: j, reason: collision with root package name */
    public float f27445j;

    /* renamed from: k, reason: collision with root package name */
    public float f27446k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27447l;

    /* renamed from: m, reason: collision with root package name */
    public float f27448m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27435n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f27464i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f27435n.get(index)) {
                case 1:
                    this.f27436a = obtainStyledAttributes.getFloat(index, this.f27436a);
                    break;
                case 2:
                    this.f27437b = obtainStyledAttributes.getFloat(index, this.f27437b);
                    break;
                case 3:
                    this.f27438c = obtainStyledAttributes.getFloat(index, this.f27438c);
                    break;
                case 4:
                    this.f27439d = obtainStyledAttributes.getFloat(index, this.f27439d);
                    break;
                case 5:
                    this.f27440e = obtainStyledAttributes.getFloat(index, this.f27440e);
                    break;
                case 6:
                    this.f27441f = obtainStyledAttributes.getDimension(index, this.f27441f);
                    break;
                case 7:
                    this.f27442g = obtainStyledAttributes.getDimension(index, this.f27442g);
                    break;
                case 8:
                    this.f27444i = obtainStyledAttributes.getDimension(index, this.f27444i);
                    break;
                case 9:
                    this.f27445j = obtainStyledAttributes.getDimension(index, this.f27445j);
                    break;
                case 10:
                    this.f27446k = obtainStyledAttributes.getDimension(index, this.f27446k);
                    break;
                case 11:
                    this.f27447l = true;
                    this.f27448m = obtainStyledAttributes.getDimension(index, this.f27448m);
                    break;
                case 12:
                    this.f27443h = n.i(obtainStyledAttributes, index, this.f27443h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
