package bh;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.prod.R;
import ij.h;
import iu.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import r3.k;
import vt.v;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f6972a = {"Active", "Inactive", "Unavailable"};

    public static final void a(TextView textView, String str) {
        String string;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (Intrinsics.a(str, "EQUITY")) {
            string = textView.getContext().getString(R.string.cash_balance);
        } else if (Intrinsics.a(str, "OPTIONS")) {
            string = textView.getContext().getString(R.string.margin_avaliable);
        } else {
            string = textView.getContext().getString(R.string.cash_balance);
        }
        textView.setText(string);
    }

    public static final void b(TextView textView, Double d10) {
        double d11;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (d10 != null) {
            d11 = d10.doubleValue();
        } else {
            d11 = 0.0d;
        }
        textView.setText(h.m(h.f20067a, d11));
    }

    public static final void c(ImageView imageView, ChangeDto changeDto) {
        Drawable m10;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (changeDto != null) {
            if (changeDto.getPercentage() == 0.0d || changeDto.getPercentage() == -0.0d) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            if (s.j(changeDto.getType(), "NEGATIVE", true)) {
                m10 = j.m(imageView.getContext(), R.drawable.ic_stock_down_arrow);
            } else {
                m10 = j.m(imageView.getContext(), R.drawable.ic_stock_up_arrow);
            }
            imageView.setImageDrawable(m10);
        }
    }

    public static final void d(ImageView imageView, Boolean bool) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(k.getDrawable(imageView.getContext(), R.drawable.ic_stock_up_arrow));
        } else if (Intrinsics.a(bool, Boolean.FALSE)) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(k.getDrawable(imageView.getContext(), R.drawable.ic_stock_down_arrow));
        } else {
            imageView.setVisibility(8);
        }
    }

    public static final void e(TextView textView, Boolean bool) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Resources resources = textView.getResources();
        boolean a10 = Intrinsics.a(bool, Boolean.TRUE);
        int i10 = R.string.profit;
        if (!a10 && Intrinsics.a(bool, Boolean.FALSE)) {
            i10 = R.string.text_loss;
        }
        textView.setText(resources.getString(i10));
    }

    public static final void f(TextView textView, String str) {
        int i10;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (v.o(f6972a, str)) {
            i10 = R.color.black_1A1A1A;
        } else {
            i10 = R.color.white;
        }
        a3.a.s(textView, i10);
    }
}
