package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f27421j;

    /* renamed from: a, reason: collision with root package name */
    public int f27422a;

    /* renamed from: b, reason: collision with root package name */
    public int f27423b;

    /* renamed from: c, reason: collision with root package name */
    public int f27424c;

    /* renamed from: d, reason: collision with root package name */
    public float f27425d;

    /* renamed from: e, reason: collision with root package name */
    public float f27426e;

    /* renamed from: f, reason: collision with root package name */
    public float f27427f;

    /* renamed from: g, reason: collision with root package name */
    public int f27428g;

    /* renamed from: h, reason: collision with root package name */
    public String f27429h;

    /* renamed from: i, reason: collision with root package name */
    public int f27430i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27421j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f27461f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f27421j.get(index)) {
                case 1:
                    this.f27426e = obtainStyledAttributes.getFloat(index, this.f27426e);
                    break;
                case 2:
                    this.f27424c = obtainStyledAttributes.getInt(index, this.f27424c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = e3.a.f14958a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f27422a = n.i(obtainStyledAttributes, index, this.f27422a);
                    break;
                case 6:
                    this.f27423b = obtainStyledAttributes.getInteger(index, this.f27423b);
                    break;
                case 7:
                    this.f27425d = obtainStyledAttributes.getFloat(index, this.f27425d);
                    break;
                case 8:
                    this.f27428g = obtainStyledAttributes.getInteger(index, this.f27428g);
                    break;
                case 9:
                    this.f27427f = obtainStyledAttributes.getFloat(index, this.f27427f);
                    break;
                case 10:
                    int i11 = obtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f27430i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i11 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f27429h = string;
                        if (string.indexOf("/") > 0) {
                            this.f27430i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f27430i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
