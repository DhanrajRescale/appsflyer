package t;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class m0 implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34882a;

    /* renamed from: b, reason: collision with root package name */
    public int f34883b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34884c;

    public /* synthetic */ m0(Object obj, int i10) {
        this.f34882a = i10;
        this.f34884c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f34882a;
        Object obj = this.f34884c;
        switch (i10) {
            case 0:
                if (this.f34883b >= ((k0) obj).h()) {
                    return false;
                }
                return true;
            case 1:
                if (this.f34883b >= ((v0.c) obj).f37644a) {
                    return false;
                }
                return true;
            case 2:
                if (this.f34883b >= ((ViewGroup) obj).getChildCount()) {
                    return false;
                }
                return true;
            case 3:
                if (this.f34883b >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.f34883b >= ((vt.d) obj).size()) {
                    return false;
                }
                return true;
            case 5:
                if (this.f34883b >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
        }
        while (this.f34883b > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f34883b--;
            } else {
                return ((Iterator) obj).hasNext();
            }
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f34882a;
        Object obj = this.f34884c;
        switch (i10) {
            case 0:
                int i11 = this.f34883b;
                this.f34883b = i11 + 1;
                return ((k0) obj).i(i11);
            case 1:
                Object[] objArr = ((v0.c) obj).f37645b;
                int i12 = this.f34883b;
                this.f34883b = i12 + 1;
                Object obj2 = objArr[i12];
                Intrinsics.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return obj2;
            case 2:
                int i13 = this.f34883b;
                this.f34883b = i13 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i13);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                int i14 = this.f34883b;
                byte[] bArr = (byte[]) obj;
                if (i14 < bArr.length) {
                    this.f34883b = i14 + 1;
                    return new ut.q(bArr[i14]);
                }
                throw new NoSuchElementException(String.valueOf(this.f34883b));
            case 4:
                if (hasNext()) {
                    int i15 = this.f34883b;
                    this.f34883b = i15 + 1;
                    return ((vt.d) obj).get(i15);
                }
                throw new NoSuchElementException();
            case 5:
                try {
                    int i16 = this.f34883b;
                    this.f34883b = i16 + 1;
                    return ((Object[]) obj)[i16];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f34883b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
        while (this.f34883b > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f34883b--;
            } else {
                return ((Iterator) obj).next();
            }
        }
        return ((Iterator) obj).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f34882a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f34884c;
                int i10 = this.f34883b - 1;
                this.f34883b = i10;
                viewGroup.removeViewAt(i10);
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m0(Object[] array) {
        this.f34882a = 5;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f34884c = array;
    }

    public m0(byte[] array) {
        this.f34882a = 3;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f34884c = array;
    }

    public m0(pu.b bVar) {
        this.f34882a = 6;
        this.f34884c = bVar.f31414a.iterator();
        this.f34883b = bVar.f31415b;
    }
}
