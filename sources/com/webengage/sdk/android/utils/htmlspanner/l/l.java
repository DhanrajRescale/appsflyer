package com.webengage.sdk.android.utils.htmlspanner.l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;
import android.text.style.ImageSpan;
import com.webengage.sdk.android.utils.htmlspanner.c;
import dv.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class l extends com.webengage.sdk.android.utils.htmlspanner.g {

    /* renamed from: f, reason: collision with root package name */
    private boolean f12841f;

    /* renamed from: b, reason: collision with root package name */
    private int f12837b = 500;

    /* renamed from: c, reason: collision with root package name */
    private Typeface f12838c = Typeface.DEFAULT;

    /* renamed from: d, reason: collision with root package name */
    private float f12839d = 26.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f12840e = -16777216;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12842g = true;

    /* loaded from: classes2.dex */
    public class a implements AlignmentSpan {
        public a() {
        }

        @Override // android.text.style.AlignmentSpan
        public Layout.Alignment getAlignment() {
            return Layout.Alignment.ALIGN_CENTER;
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12844a;

        /* renamed from: b, reason: collision with root package name */
        private List<List<Spanned>> f12845b;

        private b(boolean z10) {
            this.f12845b = new ArrayList();
            this.f12844a = z10;
        }

        public void a() {
            this.f12845b.add(new ArrayList());
        }

        public List<Spanned> b() {
            return (List) nn.d.g(this.f12845b, 1);
        }

        public List<List<Spanned>> c() {
            return this.f12845b;
        }

        public boolean d() {
            return this.f12844a;
        }

        public /* synthetic */ b(l lVar, boolean z10, a aVar) {
            this(z10);
        }

        public void a(Spanned spanned) {
            if (this.f12845b.isEmpty()) {
                throw new IllegalStateException("No rows added yet");
            }
            b().add(spanned);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends Drawable {

        /* renamed from: a, reason: collision with root package name */
        private final Layout.Alignment f12847a;

        /* renamed from: b, reason: collision with root package name */
        private List<Spanned> f12848b;

        /* renamed from: c, reason: collision with root package name */
        private int f12849c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12850d;

        public c(List<Spanned> list, boolean z10, Layout.Alignment alignment) {
            this.f12848b = list;
            this.f12849c = l.this.a(list);
            this.f12850d = z10;
            this.f12847a = alignment;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(l.this.f12840e);
            paint.setStyle(Paint.Style.STROKE);
            int size = this.f12848b.size();
            if (size == 0) {
                return;
            }
            int i10 = l.this.f12837b / size;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = i11 * i10;
                if (this.f12850d) {
                    canvas.drawRect(i12, s0.g.f34069a, i12 + i10, this.f12849c, paint);
                }
                StaticLayout staticLayout = new StaticLayout(this.f12848b.get(i11), l.this.c(), i10 - 10, this.f12847a, 1.0f, s0.g.f34069a, true);
                canvas.translate(i12 + 5, s0.g.f34069a);
                staticLayout.draw(canvas);
                canvas.translate(r12 * (-1), s0.g.f34069a);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f12849c;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return l.this.f12837b;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextPaint c() {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(this.f12840e);
        textPaint.linkColor = this.f12840e;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f12839d);
        textPaint.setTypeface(this.f12838c);
        return textPaint;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(List<Spanned> list) {
        int i10 = 0;
        if (list.size() == 0) {
            return 0;
        }
        TextPaint c10 = c();
        int size = this.f12837b / list.size();
        Iterator<Spanned> it = list.iterator();
        while (it.hasNext()) {
            StaticLayout staticLayout = new StaticLayout(it.next(), c10, size - 10, Layout.Alignment.ALIGN_NORMAL, 1.0f, s0.g.f34069a, true);
            if (staticLayout.getHeight() > i10) {
                i10 = staticLayout.getHeight();
            }
        }
        return i10;
    }

    private b a(s sVar) {
        String f10 = sVar.f("border");
        b bVar = new b(this, ("0".equals(f10) || f10 == null) ? false : true, null);
        a(sVar, bVar);
        return bVar;
    }

    public void a(float f10) {
        this.f12839d = f10;
    }

    public void a(int i10) {
        this.f12840e = i10;
    }

    @Override // com.webengage.sdk.android.utils.htmlspanner.g
    public void a(s sVar, SpannableStringBuilder spannableStringBuilder, int i10, int i11, com.webengage.sdk.android.utils.htmlspanner.e eVar) {
        b a10 = a(sVar);
        int i12 = 0;
        while (i12 < a10.c().size()) {
            List<Spanned> list = a10.c().get(i12);
            spannableStringBuilder.append("￼");
            c cVar = new c(list, a10.d(), (i12 == 0 && this.f12841f) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
            cVar.setBounds(0, 0, cVar.getIntrinsicWidth(), cVar.getIntrinsicHeight());
            int length = i12 == 0 ? i10 : spannableStringBuilder.length() - 1;
            spannableStringBuilder.append("\n");
            spannableStringBuilder.setSpan(new ImageSpan(cVar), length, spannableStringBuilder.length(), 33);
            i12++;
        }
        spannableStringBuilder.append("￼");
        c cVar2 = new c(new ArrayList(), a10.d(), Layout.Alignment.ALIGN_NORMAL);
        cVar2.setBounds(0, 0, this.f12837b, 1);
        spannableStringBuilder.setSpan(new ImageSpan(cVar2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new a(), i10, spannableStringBuilder.length(), 33);
    }

    public void a(boolean z10) {
        this.f12842g = z10;
    }

    private void a(Object obj, b bVar) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (!sVar.c().equals("td")) {
                if (!sVar.c().equals("th")) {
                    if (sVar.c().equals("tr")) {
                        bVar.a();
                    }
                    Iterator it = sVar.f14590d.iterator();
                    while (it.hasNext()) {
                        a(it.next(), bVar);
                    }
                    return;
                }
                this.f12841f = this.f12842g;
            }
            bVar.a(a().a(sVar, (c.a) null));
        }
    }
}
