package ij;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f20067a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static NumberFormat f20068b;

    /* renamed from: c, reason: collision with root package name */
    public static NumberFormat f20069c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ij.h] */
    static {
        i();
    }

    public static double a(String s7) {
        Intrinsics.checkNotNullParameter(s7, "s");
        try {
            if (s7.length() <= 0 || Intrinsics.a(s7, "null")) {
                return 0.0d;
            }
            NumberFormat numberFormat = f20069c;
            if (numberFormat != null) {
                Number parse = numberFormat.parse(s7);
                if (parse == null) {
                    return 0.0d;
                }
                return parse.doubleValue();
            }
            Intrinsics.k("numberFormatter");
            throw null;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static String b(double d10) {
        NumberFormat numberFormat = f20069c;
        if (numberFormat != null) {
            numberFormat.setRoundingMode(RoundingMode.HALF_EVEN);
            if (kj.a.f23207b) {
                NumberFormat numberFormat2 = f20069c;
                if (numberFormat2 != null) {
                    numberFormat2.setMaximumFractionDigits(3);
                } else {
                    Intrinsics.k("numberFormatter");
                    throw null;
                }
            } else {
                NumberFormat numberFormat3 = f20069c;
                if (numberFormat3 != null) {
                    numberFormat3.setMaximumFractionDigits(2);
                } else {
                    Intrinsics.k("numberFormatter");
                    throw null;
                }
            }
            NumberFormat numberFormat4 = f20069c;
            if (numberFormat4 != null) {
                String format = numberFormat4.format(d10);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }
            Intrinsics.k("numberFormatter");
            throw null;
        }
        Intrinsics.k("numberFormatter");
        throw null;
    }

    public static double c(String str) {
        if (str != null && str.length() != 0) {
            return Double.parseDouble(str);
        }
        return 0.0d;
    }

    public static String d() {
        NumberFormat numberFormat = f20069c;
        String str = null;
        if (numberFormat != null) {
            Currency currency = numberFormat.getCurrency();
            if (currency != null) {
                str = currency.getSymbol();
            }
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return str;
        }
        Intrinsics.k("numberFormatter");
        throw null;
    }

    public static String e(double d10, int i10, boolean z10) {
        if (z10) {
            NumberFormat numberFormat = f20069c;
            if (numberFormat != null) {
                numberFormat.setRoundingMode(RoundingMode.DOWN);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        } else {
            NumberFormat numberFormat2 = f20069c;
            if (numberFormat2 != null) {
                numberFormat2.setRoundingMode(RoundingMode.HALF_EVEN);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        }
        if (kj.a.f23207b) {
            NumberFormat numberFormat3 = f20069c;
            if (numberFormat3 != null) {
                numberFormat3.setMaximumFractionDigits(3);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        } else {
            NumberFormat numberFormat4 = f20069c;
            if (numberFormat4 != null) {
                numberFormat4.setMaximumFractionDigits(i10);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        }
        NumberFormat numberFormat5 = f20069c;
        if (numberFormat5 != null) {
            String format = numberFormat5.format(d10);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        Intrinsics.k("numberFormatter");
        throw null;
    }

    public static String f(int i10, int i11) {
        if (kj.a.f23207b) {
            NumberFormat numberFormat = f20069c;
            if (numberFormat != null) {
                numberFormat.setMaximumFractionDigits(3);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        } else {
            NumberFormat numberFormat2 = f20069c;
            if (numberFormat2 != null) {
                numberFormat2.setMaximumFractionDigits(i11);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        }
        NumberFormat numberFormat3 = f20069c;
        if (numberFormat3 != null) {
            String format = numberFormat3.format(Integer.valueOf(i10));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        Intrinsics.k("numberFormatter");
        throw null;
    }

    public static String g(int i10, String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (kj.a.f23207b) {
            NumberFormat numberFormat = f20069c;
            if (numberFormat != null) {
                numberFormat.setMaximumFractionDigits(3);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        } else {
            NumberFormat numberFormat2 = f20069c;
            if (numberFormat2 != null) {
                numberFormat2.setMaximumFractionDigits(i10);
            } else {
                Intrinsics.k("numberFormatter");
                throw null;
            }
        }
        try {
            NumberFormat numberFormat3 = f20069c;
            if (numberFormat3 != null) {
                String format = numberFormat3.format(Double.parseDouble(amount));
                Intrinsics.c(format);
                return format;
            }
            Intrinsics.k("numberFormatter");
            throw null;
        } catch (Exception unused) {
            return amount;
        }
    }

    public static /* synthetic */ String h(double d10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e(d10, i10, z10);
    }

    public static void i() {
        Locale locale;
        if (kj.a.f23207b) {
            locale = new Locale("en", "AE");
        } else {
            locale = new Locale("en", "IN");
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(...)");
        f20068b = currencyInstance;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "getNumberInstance(...)");
        f20069c = numberInstance;
    }

    public static String j(int i10, int i11) {
        String format;
        try {
            if (kj.a.f23207b) {
                NumberFormat numberFormat = f20068b;
                if (numberFormat != null) {
                    numberFormat.setMaximumFractionDigits(3);
                    if (i10 < 0) {
                        String d10 = d();
                        NumberFormat numberFormat2 = f20069c;
                        if (numberFormat2 != null) {
                            String format2 = numberFormat2.format(Integer.valueOf(i10));
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            format = "-" + d10 + " " + w.K("-", format2);
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    } else {
                        String d11 = d();
                        NumberFormat numberFormat3 = f20069c;
                        if (numberFormat3 != null) {
                            format = d11 + " " + numberFormat3.format(Integer.valueOf(i10));
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            } else {
                NumberFormat numberFormat4 = f20068b;
                if (numberFormat4 != null) {
                    numberFormat4.setMaximumFractionDigits(i11);
                    NumberFormat numberFormat5 = f20068b;
                    if (numberFormat5 != null) {
                        format = numberFormat5.format(Integer.valueOf(i10));
                    } else {
                        Intrinsics.k("currencyFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            }
            Intrinsics.c(format);
            return format;
        } catch (IllegalArgumentException unused) {
            return p(String.valueOf(i10));
        }
    }

    public static String k(int i10, String value) {
        String format;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (kj.a.f23207b) {
                NumberFormat numberFormat = f20068b;
                if (numberFormat != null) {
                    numberFormat.setMinimumFractionDigits(0);
                    NumberFormat numberFormat2 = f20068b;
                    if (numberFormat2 != null) {
                        numberFormat2.setMaximumFractionDigits(3);
                        if (w.s(value, "-", false)) {
                            String d10 = d();
                            NumberFormat numberFormat3 = f20069c;
                            if (numberFormat3 != null) {
                                String format2 = numberFormat3.format(value);
                                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                format = "-" + d10 + " " + w.K("-", format2);
                            } else {
                                Intrinsics.k("numberFormatter");
                                throw null;
                            }
                        } else {
                            String d11 = d();
                            NumberFormat numberFormat4 = f20069c;
                            if (numberFormat4 != null) {
                                format = d11 + " " + numberFormat4.format(value);
                            } else {
                                Intrinsics.k("numberFormatter");
                                throw null;
                            }
                        }
                    } else {
                        Intrinsics.k("currencyFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            } else {
                NumberFormat numberFormat5 = f20068b;
                if (numberFormat5 != null) {
                    numberFormat5.setMaximumFractionDigits(i10);
                    NumberFormat numberFormat6 = f20068b;
                    if (numberFormat6 != null) {
                        format = numberFormat6.format(Double.parseDouble(value));
                    } else {
                        Intrinsics.k("currencyFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            }
            Intrinsics.c(format);
            return format;
        } catch (IllegalArgumentException unused) {
            return p(value);
        }
    }

    public static String l(float f10) {
        String format;
        try {
            if (kj.a.f23207b) {
                NumberFormat numberFormat = f20068b;
                if (numberFormat != null) {
                    numberFormat.setMaximumFractionDigits(3);
                    if (Float.compare(f10, 0) < 0) {
                        String d10 = d();
                        NumberFormat numberFormat2 = f20069c;
                        if (numberFormat2 != null) {
                            String format2 = numberFormat2.format(Float.valueOf(f10));
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            format = "-" + d10 + " " + w.K("-", format2);
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    } else {
                        String d11 = d();
                        NumberFormat numberFormat3 = f20069c;
                        if (numberFormat3 != null) {
                            format = d11 + " " + numberFormat3.format(Float.valueOf(f10));
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            } else {
                NumberFormat numberFormat4 = f20068b;
                if (numberFormat4 != null) {
                    numberFormat4.setMaximumFractionDigits(2);
                    NumberFormat numberFormat5 = f20068b;
                    if (numberFormat5 != null) {
                        format = numberFormat5.format(Float.valueOf(f10));
                    } else {
                        Intrinsics.k("currencyFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            }
            Intrinsics.c(format);
            return format;
        } catch (IllegalArgumentException unused) {
            return p(String.valueOf(f10));
        }
    }

    public static String m(h hVar, double d10) {
        String format;
        hVar.getClass();
        try {
            if (kj.a.f23207b) {
                NumberFormat numberFormat = f20068b;
                if (numberFormat != null) {
                    numberFormat.setMaximumFractionDigits(3);
                    if (Double.compare(d10, 0.0d) < 0) {
                        String d11 = d();
                        NumberFormat numberFormat2 = f20069c;
                        if (numberFormat2 != null) {
                            String format2 = numberFormat2.format(d10);
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            format = "-" + d11 + " " + w.K("-", format2);
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    } else {
                        String d12 = d();
                        NumberFormat numberFormat3 = f20069c;
                        if (numberFormat3 != null) {
                            format = d12 + " " + numberFormat3.format(d10);
                        } else {
                            Intrinsics.k("numberFormatter");
                            throw null;
                        }
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            } else {
                NumberFormat numberFormat4 = f20068b;
                if (numberFormat4 != null) {
                    numberFormat4.setMaximumFractionDigits(2);
                    NumberFormat numberFormat5 = f20068b;
                    if (numberFormat5 != null) {
                        format = numberFormat5.format(d10);
                    } else {
                        Intrinsics.k("currencyFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("currencyFormatter");
                    throw null;
                }
            }
            Intrinsics.c(format);
            return format;
        } catch (IllegalArgumentException unused) {
            return k(2, String.valueOf(d10));
        }
    }

    public static String p(String str) {
        String str2;
        if (kj.a.f23207b) {
            str2 = "AED %1$s";
        } else {
            str2 = "₹ %1$s";
        }
        return a3.a.m(new Object[]{str}, 1, str2, "format(...)");
    }

    public static String t(String str) {
        if (str != null && str.length() != 0) {
            return jr.h.r(g(2, str), " %");
        }
        return "0.00 %";
    }

    public final String n(int i10, String str) {
        double d10;
        if (str != null && str.length() != 0) {
            d10 = Double.parseDouble(str) * i10;
        } else {
            d10 = 0.0d;
        }
        return m(this, d10);
    }

    public final String q(double d10) {
        String m10 = m(this, d10);
        if (d10 > 0.0d) {
            return a3.a.f("+", m10);
        }
        return m10;
    }

    public final String r(int i10, String str) {
        double d10;
        if (str != null && str.length() != 0) {
            d10 = Double.parseDouble(str) * i10;
        } else {
            d10 = 0.0d;
        }
        return q(d10);
    }
}
