package r4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import mt.p;

/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f33067a;

    /* renamed from: b, reason: collision with root package name */
    public final e f33068b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33069c;

    public g(TextView textView) {
        super(6);
        this.f33067a = textView;
        this.f33069c = true;
        this.f33068b = new e(textView);
    }

    @Override // mt.p
    public final void C(boolean z10) {
        if (z10) {
            TextView textView = this.f33067a;
            textView.setTransformationMethod(I(textView.getTransformationMethod()));
        }
    }

    @Override // mt.p
    public final void D(boolean z10) {
        this.f33069c = z10;
        TextView textView = this.f33067a;
        textView.setTransformationMethod(I(textView.getTransformationMethod()));
        textView.setFilters(v(textView.getFilters()));
    }

    @Override // mt.p
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        if (this.f33069c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new j(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f33074a;
        }
        return transformationMethod;
    }

    @Override // mt.p
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f33069c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof e) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            e eVar = this.f33068b;
            if (i13 < length2) {
                if (inputFilterArr[i13] != eVar) {
                    i13++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // mt.p
    public final boolean z() {
        return this.f33069c;
    }
}
