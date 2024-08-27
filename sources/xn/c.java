package xn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.assetgro.stockgro.prod.R;
import java.io.IOException;
import java.util.Locale;
import mo.c0;
import org.xmlpull.v1.XmlPullParserException;
import s0.g;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f40525a;

    /* renamed from: b, reason: collision with root package name */
    public final b f40526b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final float f40527c;

    /* renamed from: d, reason: collision with root package name */
    public final float f40528d;

    /* renamed from: e, reason: collision with root package name */
    public final float f40529e;

    /* renamed from: f, reason: collision with root package name */
    public final float f40530f;

    /* renamed from: g, reason: collision with root package name */
    public final float f40531g;

    /* renamed from: h, reason: collision with root package name */
    public final float f40532h;

    /* renamed from: i, reason: collision with root package name */
    public final float f40533i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40534j;

    /* renamed from: k, reason: collision with root package name */
    public final int f40535k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40536l;

    public c(Context context, b bVar) {
        b bVar2;
        AttributeSet attributeSet;
        int i10;
        boolean z10;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int i11;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int next;
        if (bVar == null) {
            bVar2 = new b();
        } else {
            bVar2 = bVar;
        }
        int i12 = bVar2.f40502a;
        if (i12 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i12);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i10 = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i12));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        int i13 = i10 == 0 ? 2132083877 : i10;
        int[] iArr = un.a.f37292c;
        c0.a(context, attributeSet, R.attr.badgeStyle, i13);
        c0.b(context, attributeSet, iArr, R.attr.badgeStyle, i13, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.badgeStyle, i13);
        Resources resources = context.getResources();
        this.f40527c = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.f40533i = obtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f40534j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f40535k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f40528d = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.f40529e = obtainStyledAttributes.getDimension(9, resources.getDimension(R.dimen.m3_badge_size));
        this.f40531g = obtainStyledAttributes.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f40530f = obtainStyledAttributes.getDimension(2, resources.getDimension(R.dimen.m3_badge_size));
        this.f40532h = obtainStyledAttributes.getDimension(10, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f40536l = obtainStyledAttributes.getInt(19, 1);
        b bVar3 = this.f40526b;
        int i14 = bVar2.f40510i;
        bVar3.f40510i = i14 == -2 ? 255 : i14;
        CharSequence charSequence = bVar2.f40514m;
        bVar3.f40514m = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar4 = this.f40526b;
        int i15 = bVar2.f40515n;
        bVar4.f40515n = i15 == 0 ? R.plurals.mtrl_badge_content_description : i15;
        int i16 = bVar2.f40516o;
        bVar4.f40516o = i16 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i16;
        Boolean bool = bVar2.f40518q;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar4.f40518q = Boolean.valueOf(z10);
        b bVar5 = this.f40526b;
        int i17 = bVar2.f40512k;
        bVar5.f40512k = i17 == -2 ? obtainStyledAttributes.getInt(17, 4) : i17;
        int i18 = bVar2.f40511j;
        if (i18 != -2) {
            this.f40526b.f40511j = i18;
        } else if (obtainStyledAttributes.hasValue(18)) {
            this.f40526b.f40511j = obtainStyledAttributes.getInt(18, 0);
        } else {
            this.f40526b.f40511j = -1;
        }
        b bVar6 = this.f40526b;
        Integer num = bVar2.f40506e;
        if (num == null) {
            intValue = obtainStyledAttributes.getResourceId(4, 2132083213);
        } else {
            intValue = num.intValue();
        }
        bVar6.f40506e = Integer.valueOf(intValue);
        b bVar7 = this.f40526b;
        Integer num2 = bVar2.f40507f;
        if (num2 == null) {
            intValue2 = obtainStyledAttributes.getResourceId(5, 0);
        } else {
            intValue2 = num2.intValue();
        }
        bVar7.f40507f = Integer.valueOf(intValue2);
        b bVar8 = this.f40526b;
        Integer num3 = bVar2.f40508g;
        if (num3 == null) {
            intValue3 = obtainStyledAttributes.getResourceId(12, 2132083213);
        } else {
            intValue3 = num3.intValue();
        }
        bVar8.f40508g = Integer.valueOf(intValue3);
        b bVar9 = this.f40526b;
        Integer num4 = bVar2.f40509h;
        if (num4 == null) {
            intValue4 = obtainStyledAttributes.getResourceId(13, 0);
        } else {
            intValue4 = num4.intValue();
        }
        bVar9.f40509h = Integer.valueOf(intValue4);
        b bVar10 = this.f40526b;
        Integer num5 = bVar2.f40503b;
        if (num5 == null) {
            intValue5 = dp.b.l1(context, obtainStyledAttributes, 0).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        bVar10.f40503b = Integer.valueOf(intValue5);
        b bVar11 = this.f40526b;
        Integer num6 = bVar2.f40505d;
        if (num6 == null) {
            intValue6 = obtainStyledAttributes.getResourceId(6, 2132083372);
        } else {
            intValue6 = num6.intValue();
        }
        bVar11.f40505d = Integer.valueOf(intValue6);
        Integer num7 = bVar2.f40504c;
        if (num7 != null) {
            this.f40526b.f40504c = num7;
        } else if (obtainStyledAttributes.hasValue(7)) {
            this.f40526b.f40504c = Integer.valueOf(dp.b.l1(context, obtainStyledAttributes, 7).getDefaultColor());
        } else {
            int intValue13 = this.f40526b.f40505d.intValue();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue13, un.a.U);
            obtainStyledAttributes2.getDimension(0, g.f34069a);
            ColorStateList l12 = dp.b.l1(context, obtainStyledAttributes2, 3);
            dp.b.l1(context, obtainStyledAttributes2, 4);
            dp.b.l1(context, obtainStyledAttributes2, 5);
            obtainStyledAttributes2.getInt(2, 0);
            obtainStyledAttributes2.getInt(1, 1);
            if (obtainStyledAttributes2.hasValue(12)) {
                i11 = 12;
            } else {
                i11 = 10;
            }
            obtainStyledAttributes2.getResourceId(i11, 0);
            obtainStyledAttributes2.getString(i11);
            obtainStyledAttributes2.getBoolean(14, false);
            dp.b.l1(context, obtainStyledAttributes2, 6);
            obtainStyledAttributes2.getFloat(7, g.f34069a);
            obtainStyledAttributes2.getFloat(8, g.f34069a);
            obtainStyledAttributes2.getFloat(9, g.f34069a);
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(intValue13, un.a.E);
            obtainStyledAttributes3.hasValue(0);
            obtainStyledAttributes3.getFloat(0, g.f34069a);
            obtainStyledAttributes3.recycle();
            this.f40526b.f40504c = Integer.valueOf(l12.getDefaultColor());
        }
        b bVar12 = this.f40526b;
        Integer num8 = bVar2.f40517p;
        if (num8 == null) {
            intValue7 = obtainStyledAttributes.getInt(1, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        bVar12.f40517p = Integer.valueOf(intValue7);
        b bVar13 = this.f40526b;
        Integer num9 = bVar2.f40519r;
        if (num9 == null) {
            intValue8 = obtainStyledAttributes.getDimensionPixelOffset(15, 0);
        } else {
            intValue8 = num9.intValue();
        }
        bVar13.f40519r = Integer.valueOf(intValue8);
        b bVar14 = this.f40526b;
        Integer num10 = bVar2.f40520s;
        if (num10 == null) {
            intValue9 = obtainStyledAttributes.getDimensionPixelOffset(20, 0);
        } else {
            intValue9 = num10.intValue();
        }
        bVar14.f40520s = Integer.valueOf(intValue9);
        b bVar15 = this.f40526b;
        Integer num11 = bVar2.f40521t;
        if (num11 == null) {
            intValue10 = obtainStyledAttributes.getDimensionPixelOffset(16, bVar15.f40519r.intValue());
        } else {
            intValue10 = num11.intValue();
        }
        bVar15.f40521t = Integer.valueOf(intValue10);
        b bVar16 = this.f40526b;
        Integer num12 = bVar2.f40522u;
        if (num12 == null) {
            intValue11 = obtainStyledAttributes.getDimensionPixelOffset(21, bVar16.f40520s.intValue());
        } else {
            intValue11 = num12.intValue();
        }
        bVar16.f40522u = Integer.valueOf(intValue11);
        b bVar17 = this.f40526b;
        Integer num13 = bVar2.f40523v;
        if (num13 == null) {
            intValue12 = 0;
        } else {
            intValue12 = num13.intValue();
        }
        bVar17.f40523v = Integer.valueOf(intValue12);
        b bVar18 = this.f40526b;
        Integer num14 = bVar2.f40524w;
        bVar18.f40524w = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        obtainStyledAttributes.recycle();
        Locale locale = bVar2.f40513l;
        if (locale == null) {
            this.f40526b.f40513l = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f40526b.f40513l = locale;
        }
        this.f40525a = bVar2;
    }

    public final boolean a() {
        if (this.f40526b.f40511j != -1) {
            return true;
        }
        return false;
    }
}
