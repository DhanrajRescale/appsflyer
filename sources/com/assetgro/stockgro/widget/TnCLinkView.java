package com.assetgro.stockgro.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import b4.d;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.n0;
import z9.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/widget/TnCLinkView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lqj/n0;", "format", HttpUrl.FRAGMENT_ENCODE_SET, "setTncText", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TnCLinkView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnCLinkView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f42199k);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            n0[] n0VarArr = n0.f32046a;
            setTncText(n0.values()[obtainStyledAttributes.getInteger(0, 0)]);
            obtainStyledAttributes.recycle();
        }
    }

    private final void setTncText(n0 format) {
        int i10;
        int ordinal = format.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i10 = R.string.tnc_disclaimer;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = R.string.terms_and_conditions;
        }
        setText(d.a(getContext().getString(i10), 0));
    }
}
