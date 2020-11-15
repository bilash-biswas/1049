package main

import (
	"fmt"
)

func main() {
	var c, b, a string
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	if a == "vertebrado" {
		if b == "ave" {
			if c == "carnivoro" {
				fmt.Printf("aguia\n")
			} else if c == "onivoro" {
				fmt.Printf("pomba\n")
			}
		} else if b == "mamifero" {
			if c == "onivoro" {
				fmt.Printf("homem\n")
			} else if c == "herbivoro" {
				fmt.Printf("vaca\n")
			}
		}
	} else if a == "invertebrado" {
		if b == "inseto" {
			if c == "hematofago" {
				fmt.Printf("pulga\n")
			} else if c == "herbivoro" {
				fmt.Printf("lagarta\n")
			}
		} else if b == "anelideo" {
			if c == "hematofago" {
				fmt.Printf("sanguessuga\n")
			} else if c == "onivoro" {
				fmt.Printf("minhoca\n")
			}
		}
	}
}
