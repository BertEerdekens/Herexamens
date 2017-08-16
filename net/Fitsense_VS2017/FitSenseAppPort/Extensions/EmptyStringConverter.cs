using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;
using System.Globalization;

namespace FitSenseAppPort.Extensions
{
    public class EmptyStringConverter : IValueConverter
    {
        public object Convert(
            object value,
            Type targetType,
            object parameter,
            CultureInfo culture)
        {
            String str = (String)value;
            return String.IsNullOrWhiteSpace(str) ? "<un-named device>" : str;
        }

        public object ConvertBack(
            object value,
            Type targetType,
            object parameter,
            CultureInfo culture)
        {
            throw new NotImplementedException("EmptyStringConverter is one-way");
        }
    }
}