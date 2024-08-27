package np;

import dp.b;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f29070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29072c;

    public a(int i10, int i11, int[] iArr) {
        this.f29070a = iArr;
        this.f29071b = i10;
        this.f29072c = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f29071b;
            while (true) {
                if (i10 >= this.f29072c) {
                    break;
                }
                if (this.f29070a[i10] == intValue) {
                    if (i10 != -1) {
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f29070a[this.f29071b + i10] != aVar.f29070a[aVar.f29071b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b.S0(i10, size());
        return Integer.valueOf(this.f29070a[this.f29071b + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f29071b; i11 < this.f29072c; i11++) {
            i10 = (i10 * 31) + this.f29070a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f29071b;
            int i11 = i10;
            while (true) {
                if (i11 < this.f29072c) {
                    if (this.f29070a[i11] == intValue) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f29072c;
            while (true) {
                i11--;
                i10 = this.f29071b;
                if (i11 >= i10) {
                    if (this.f29070a[i11] == intValue) {
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        b.S0(i10, size());
        int i11 = this.f29071b + i10;
        int[] iArr = this.f29070a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29072c - this.f29071b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        b.U0(i10, i11, size());
        if (i10 == i11) {
            return Collections.emptyList();
        }
        int i12 = this.f29071b;
        return new a(i10 + i12, i12 + i11, this.f29070a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f29070a;
        int i10 = this.f29071b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f29072c) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
