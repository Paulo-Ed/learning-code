Segundos_str = input("Digite o valor em segundos para conversão: ")

Segundos = int(Segundos_str)
Dias = Segundos // 86400
Segundos_Resto = Segundos % 86400
Hora = Segundos_Resto // 3600
Segundos_Resto = Segundos % 3600
Minutos = Segundos_Resto // 60
Segundos_Final = Segundos_Resto % 60

print("Dias: ", Dias, "Horas: ", Hora, "Minutos: ", Minutos, "Segundos: ", Segundos_Final)
